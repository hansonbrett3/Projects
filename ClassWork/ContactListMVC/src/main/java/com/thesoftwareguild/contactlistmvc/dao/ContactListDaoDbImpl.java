/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc.dao;

import com.thesoftwareguild.contactlistmvc.model.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author apprentice
 */

/* Created new Class ContactListDaoImpl - added implements ContactListDao as well as import abstract methods*/
public class ContactListDaoDbImpl implements ContactListDao {

    private static final String SQL_INSERT_CONTACT
            = "INSERT INTO contacts(first_name, last_name, company, phone, email)"
            + "values(?,?,?,?,?)";

    private static final String SQL_DELETE_CONTACT
            = "DELETE FROM contacts WHERE contact_id=?";

    private static final String SQL_SELECT_CONTACT
            = "SELECT * FROM contacts WHERE contact_id=?";

    private static final String SQL_UPDATE_CONTACT
            = "UPDATE contacts SET first_name=?, last_name=?, company=?, phone=?, email=?"
            + "WHERE contact_id=?";
    private static final String SQL_SELECT_ALL_CONTACTS
            = "SELECT * FROM contacts";
    private static final String SQL_SELECT_CONTACTS_BY_LAST_NAME
            = "SELECT * FROM contacts WHERE last_name=?";
    private static final String SQL_SELECT_CONTACTS_BY_COMPANY
            = "SELECT * FROM contacts WHERE company=?";

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false) /*ADDING TRANSACTIONAL STATEMENT*/

    public Contact addContact(Contact contact) {
        jdbcTemplate.update(SQL_INSERT_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail()
        );
        contact.setContactId(jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Integer.class));
        return contact;
    }

    @Override
    public void removeContact(int contactId) {
        jdbcTemplate.update(SQL_DELETE_CONTACT, contactId);

    }

    @Override
    public void updateContact(Contact contact) {
        jdbcTemplate.update(SQL_UPDATE_CONTACT,
                contact.getFirstName(),
                contact.getLastName(),
                contact.getCompany(),
                contact.getPhone(),
                contact.getEmail(),
                contact.getContactId()
        );
    }

    @Override
    public List<Contact> getAllContacts() {
        return jdbcTemplate.query(SQL_SELECT_ALL_CONTACTS, new ContactMapper());
    }

    @Override
    public Contact getContactById(int contactId) {
        try {
            return jdbcTemplate.queryForObject(SQL_SELECT_CONTACT, new ContactMapper(), contactId);
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
    }

    @Override
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria) {
        if (criteria == null || criteria.size() == 0) {
            return getAllContacts();
        }

        StringBuilder query = new StringBuilder("SELECT * FROM contacts WHERE ");

        int numParams = criteria.size();
        int paramPosition = 0;

        String[] paramVals = new String[numParams];

        Set<SearchTerm> keyset = criteria.keySet();
        Iterator<SearchTerm> iter = keyset.iterator();

        while (iter.hasNext()) {
            SearchTerm currentKey = iter.next();
            String currentValue = criteria.get(currentKey);

            if (paramPosition > 0) {
                query.append(" and ");
            }

            query.append(currentKey);
            query.append(" =? ");

            paramVals[paramPosition] = currentValue;
            paramPosition++;
        }
        return jdbcTemplate.query(query.toString(), new ContactMapper(), paramVals);
    }

    @Override
    public List<Contact> searchContactsByLastName(String lastName) {
        return jdbcTemplate.query(SQL_SELECT_CONTACTS_BY_LAST_NAME, new ContactMapper(), lastName);
    }

    @Override
    public List<Contact> searchContactsByCompanyMap(String company) {
        return jdbcTemplate.query(SQL_SELECT_CONTACTS_BY_COMPANY, new ContactMapper(), company);
    }

    private static final class ContactMapper implements RowMapper<Contact> {

        @Override
        public Contact mapRow(ResultSet rs, int i) throws SQLException {
            Contact contact = new Contact();
            contact.setContactId(rs.getInt("contact_id"));
            contact.setFirstName(rs.getString("first_name"));
            contact.setLastName(rs.getString("last_name"));
            contact.setPhone(rs.getString("phone"));
            contact.setCompany(rs.getString("company"));
            contact.setEmail(rs.getString("email"));
            return contact;
        }
        /* Takes results from database by name and turns them into our object */
    }

}
