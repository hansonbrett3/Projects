/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.dao;

import com.thesoftwareguild.flooringmastery.dto.Order;
import com.thesoftwareguild.flooringmastery.dto.Product;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.time.LocalDate;

/**
 *
 * @author apprentice
 */
public class OrderBookTest {

    Order orderAddTest = null;
    Order orderRemoveTest = null;

    public OrderBookTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Product productTest = new Product("Laminate", 6, 8);
        orderAddTest = new Order("TestName B", "PA", 77, 66, productTest, LocalDate.parse("01/16/1992", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        
        orderRemoveTest = new Order("TestName B", "PA", 77, 66, productTest, LocalDate.parse("01/16/1992", DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }
    
    @After

    public void tearDown() {
    }

    @Test
    public void testAddOrder() throws FileNotFoundException {
        OrderBook addDao = new OrderBook(); // 
        addDao.addOrder(orderAddTest);

        Order result = addDao.getOrderByNumber(orderAddTest.getOrderNumber());
        Assert.assertEquals(orderAddTest, result);

    }

    @Test
    public void testSave() {

    }

    @Test
    public void testRemoveOrder() throws FileNotFoundException {
        OrderBook removeDao = new OrderBook();
        removeDao.removeOrder(orderRemoveTest.getDate(),orderRemoveTest.getOrderNumber());
        Order result = removeDao.getOrderByNumber(orderRemoveTest.getOrderNumber());
        Assert.assertEquals(null, result);
    }
    
    @Test
    public void testGetOrderByNumber() {

    }
}

