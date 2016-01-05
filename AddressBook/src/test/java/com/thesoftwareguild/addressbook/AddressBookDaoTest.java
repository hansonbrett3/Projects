/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbook;

import com.thesoftwareguild.addressbook.dao.AddressBookDao;
import com.thesoftwareguild.addressbook.dao.SearchTerm;
import com.thesoftwareguild.addressbook.model.Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bretthanson
 */
public class AddressBookDaoTest {

    private AddressBookDao dao;

    public AddressBookDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        dao = ctx.getBean("addressBookDao", AddressBookDao.class);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addGetDeleteAddress() {
        Address ad = new Address();
        ad.setFirst("Jane");
        ad.setLast("Doe");
        ad.setStreet("111 First Street");
        ad.setCity("Cleveland");
        ad.setState("OH");
        ad.setZip("44118");

        dao.addAddress(ad);

        Address fromDb = dao.getAddressById(ad.getAddressId());
        assertEquals(fromDb, ad);
        dao.removeAddress(ad.getAddressId());
        assertNull(dao.getAddressById(ad.getAddressId()));
    }

    @Test
    public void addUpdateAddress() {
        Address ad = new Address();
        ad.setFirst("Jane");
        ad.setLast("Doe");
        ad.setStreet("111 First Street");
        ad.setCity("Cleveland");
        ad.setState("OH");
        ad.setZip("44118");

        dao.addAddress(ad);

        ad.setCity("Chicago");

        dao.updateAddress(ad);

        Address fromDb = dao.getAddressById(ad.getAddressId());

        assertEquals(fromDb, ad);
    }

    @Test
    public void getAllDvds() {
        Address ad = new Address();
        ad.setFirst("Jane");
        ad.setLast("Doe");
        ad.setStreet("111 First Street");
        ad.setCity("Cleveland");
        ad.setState("OH");
        ad.setZip("44118");

        dao.addAddress(ad);

        Address ad2 = new Address();
        ad2.setFirst("Tony");
        ad2.setLast("Smith");
        ad2.setStreet("222 Second Street");
        ad2.setCity("Chicago");
        ad2.setState("IL");
        ad2.setZip("55555");

        dao.addAddress(ad2);

        List<Address> aList = dao.getAllAddresses();
        assertEquals(aList.size(), 2);

    }

    @Test
    public void searchAddresses() {
        Address ad = new Address();
        ad.setFirst("Jane");
        ad.setLast("Doe");
        ad.setStreet("111 First Street");
        ad.setCity("Cleveland");
        ad.setState("OH");
        ad.setZip("44118");

        dao.addAddress(ad);

        Address ad2 = new Address();
        ad2.setFirst("Tony");
        ad2.setLast("Smith");
        ad2.setStreet("222 Second Street");
        ad2.setCity("Chicago");
        ad2.setState("IL");
        ad2.setZip("55555");

        dao.addAddress(ad2);

        Address ad3 = new Address();
        ad3.setFirst("Brett");
        ad3.setLast("Doe");
        ad3.setStreet("333 Third Street");
        ad3.setCity("Knoxville");
        ad3.setState("TN");
        ad3.setZip("33333");

        dao.addAddress(ad3);
        
        Map<SearchTerm, String> criteria = new HashMap<>();
        criteria.put(SearchTerm.LAST, "Smith");
        List<Address> aList = dao.searchAddresses(criteria);
        assertEquals(1, aList.size());
        assertEquals(ad2, aList.get(0));
        
        criteria.put(SearchTerm.LAST, "Doe");
        aList = dao.searchAddresses(criteria);
        assertEquals(2, aList.size());
        
        criteria.put(SearchTerm.CITY, "Cleveland");
        aList = dao.searchAddresses(criteria);
        assertEquals(1, aList.size());
        assertEquals(ad, aList.get(0));
        
        criteria.put(SearchTerm.CITY, "Knoxville");
        aList = dao.searchAddresses(criteria);
        assertEquals(1, aList.size());
        assertEquals(ad3, aList.get(0));
        
        criteria.put(SearchTerm.CITY, "New York City");
        aList = dao.searchAddresses(criteria);
        assertEquals(0, aList.size());
    }
}