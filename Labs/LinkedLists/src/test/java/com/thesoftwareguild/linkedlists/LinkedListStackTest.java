/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlists;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class LinkedListStackTest {
    
    public LinkedListStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    
     /**
     * Test of size method, of class LinkedListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedListStack instance = new LinkedListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
       
    }
    

    /**
     * Test of push method, of class LinkedListStack.
     */
    @Test
    public void testPushSize() {
        System.out.println("push");
        LinkedListStack instance = new LinkedListStack();
        Object bob = "Bob";
        int expResult = 1;
        instance.push(bob);
        int result = instance.size();
        assertEquals(expResult, result);
        
        
    }
    
    /**
     * Second test of push method, of class LinkedListStack.
     */
     @Test
    public void testPush5() {
        System.out.println("push");
        LinkedListStack instance = new LinkedListStack();
        int expResult = 5;
        Object bob = "Bob";
        Object dave = "Dave";
        Object jim = "Jim";
        Object rick = "Rick";
        Object larry = "Larry";
        
        instance.push(bob);
        instance.push(dave);
        instance.push(jim);
        instance.push(rick);
        instance.push(larry);
        int result = instance.size();
        assertEquals(expResult, result);
        
        

    }

    /**
     * Test of get method, of class LinkedListStack.
     */
//    @Test
//    public void testGet() {
//        System.out.println("get");
//        int index = 0;
//        LinkedListStack instance = new LinkedListStack();
//        Object expResult = null;
//        Object result = instance.get(index);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of isEmpty method, of class LinkedListStack.
     */
    @Test
    public void testIsEmptyTrue() {
        System.out.println("isEmpty");
        LinkedListStack instance = new LinkedListStack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
   
    }
    
    
    /**
     * Test 2 of isEmpty method, of class LinkedListStack.
     */
    @Test
    public void testIsEmptyFalse() {
        System.out.println("isEmpty");
        LinkedListStack instance = new LinkedListStack();
        boolean expResult = false;        
        Object bob = "Bob";
        instance.push(bob);
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
   

    }

    /**
     * Test of pop method, of class LinkedListStack.
     */
    @Test
    public void testPop1() {
        System.out.println("pop");
        LinkedListStack instance = new LinkedListStack();
        Object expResult = null;
        Object bob = "Bob";
        instance.push(bob);
        Object result = instance.pop();
        assertEquals(expResult, result);
        
    }
    
    
      /**
     * Test 2 of pop method, of class LinkedListStack.
     */
    @Test
    public void testPushPushPop() {
        System.out.println("pop");
        LinkedListStack instance = new LinkedListStack();        
        Object bob = "Bob";        
        Object tom = "Tom";
        instance.push(bob);
        instance.push(tom);
        instance.pop();
        Object expResult = bob;
        Object result = instance.get(0);
        assertEquals(expResult, result);
        
    }
    
    
    //The last test below works, just need to figure out how to assert that it works correctly!
    
    
      /**
     * Test 3 of pop method, of class LinkedListStack.
     */
//    @Test
//    public void testPopTooMany() {
//        System.out.println("pop");
//        LinkedListStack instance = new LinkedListStack();
//        Object bob = "Bob";
//        instance.push(bob);
//        instance.pop();
//        instance.pop();
//        instance.pop();
//        instance.pop();
//        instance.pop();
//        Assert.fail();
//        
//    }

}
