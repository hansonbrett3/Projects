/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc.dao;

import com.thesoftwareguild.contactlistmvc.model.Contact;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface ContactListDao {
    
    public Contact addContact(Contact contact);
    public void removeContact(int contactId);
    public void updateContact(Contact contact);
    public List<Contact> getAllContacts();
    public Contact getContactById(int contactId);
    public List<Contact> searchContacts(Map<SearchTerm, String> criteria);
    public List<Contact> searchContactsByLastName(String lastName);
    public List<Contact> searchContactsByCompanyMap(String company);
}
