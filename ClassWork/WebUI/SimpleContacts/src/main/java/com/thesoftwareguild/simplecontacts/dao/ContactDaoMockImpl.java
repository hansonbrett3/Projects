/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecontacts.dao;

import com.thesoftwareguild.simplecontacts.dto.Contact;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class ContactDaoMockImpl implements ContactDAO {

    @Override
    public List<Contact> getContact() {

        List<Contact> list = new ArrayList();

        Contact c1 = new Contact();
        c1.setName("John Doe");
        c1.setPhone("555-1212");
        c1.setEmail("jdoe@doe.com");

        list.add(c1);

        c1 = new Contact();
        c1.setName("Sally Smith");
        c1.setPhone("555-1223");
        c1.setEmail("sally@smith.com");

        list.add(c1);

        c1 = new Contact();
        c1.setName("Bert Johnson");
        c1.setPhone("555-1225");
        c1.setEmail("bjohnson@mail.com");

        list.add(c1);

        return list;
    }

}
