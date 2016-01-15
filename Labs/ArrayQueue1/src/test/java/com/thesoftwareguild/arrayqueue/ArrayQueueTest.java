/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.arrayqueue;

import java.util.Iterator;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class ArrayQueueTest {

    ArrayQueue arrayQueue;

    public ArrayQueueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        arrayQueue = new ArrayQueue();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of enqueue method, of class ArrayQueue.
     */
    @Test
    public void testEnqueue() {

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayQueue.enqueue(bob);
        arrayQueue.enqueue(ernie);
        arrayQueue.enqueue(cait);
        arrayQueue.enqueue(mary);
        arrayQueue.enqueue(jon);

        int numItems = arrayQueue.size();

        Assert.assertEquals(5, numItems);

    }

    /**
     * Test of dequeue method, of class ArrayQueue.
     */
    @Test
    public void testDequeue() {
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayQueue.enqueue(bob);
        arrayQueue.enqueue(ernie);
        arrayQueue.enqueue(cait);
        arrayQueue.enqueue(mary);
        arrayQueue.enqueue(jon);

        arrayQueue.dequeue();
        arrayQueue.dequeue();

        int numItems = arrayQueue.size();

        Assert.assertEquals(3, numItems);
    }

    /**
     * Test of dequeue method, of class ArrayQueue.
     */
    @Test
    public void testFifoNull() {
        String result = "";

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";

        arrayQueue.enqueue(bob);
        arrayQueue.enqueue(ernie);
        arrayQueue.enqueue(cait);
        arrayQueue.enqueue(mary);

        arrayQueue.dequeue();
        Iterator itr = arrayQueue.iterator();
        while (itr.hasNext()) {
            result = (String) itr.next();
        }

        Assert.assertEquals(null, result);
    }

    /**
     * Test of isEmpty method, of class ArrayQueue.
     */
    @Test
    public void testIsEmpty() {
        String result = "";

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";

        arrayQueue.enqueue(bob);
        arrayQueue.enqueue(ernie);
        arrayQueue.enqueue(cait);
        arrayQueue.enqueue(mary);

        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();

        boolean emptyArray = arrayQueue.isEmpty();

        Assert.assertTrue(emptyArray);
    }

    /**
     * Test to see that tail is reassigned to index 0 when head is at end of
     * array, of class ArrayQueue.
     */
    @Test
    public void reassignTail() {

        String result = "";

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String tom = "Tom";
        String sam = "Sam";

        arrayQueue.enqueue(bob); // slot 0
        arrayQueue.enqueue(ernie); // slot 1
        arrayQueue.enqueue(cait); // slot 2
        arrayQueue.enqueue(mary); // slot 3

        arrayQueue.dequeue(); // remove bob, head goes to 1
        arrayQueue.dequeue(); // remove ernie, head goes to 2
        arrayQueue.dequeue(); // remove cait, head goes to 3

        arrayQueue.enqueue(tom); // tom should be in slot 0
        arrayQueue.enqueue(sam); // sam should be in slot 1

        Iterator itr = arrayQueue.iterator();
        while (itr.hasNext()) {
            result = (String) itr.next();
        }

        Assert.assertEquals("Tom", result);
    }

    @Test
    public void tailAndHeadOverlap() {

        String result = "";

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String tom = "Tom";
        String sam = "Sam";

         arrayQueue.enqueue(bob); // slot 0, head is 0 tail is 1
         arrayQueue.enqueue(ernie); // slot 1
         arrayQueue.enqueue(cait); // cait is in slot 2
         arrayQueue.enqueue(mary); // mary goes to slot 3
         arrayQueue.enqueue(tom); // tom should be in slot 4
         arrayQueue.enqueue(sam); // sam should be in slot 5
         
     

        Iterator itr = arrayQueue.iterator();
        while (itr.hasNext()) {
            result = (String) itr.next();
        }

        Assert.assertEquals("Bob", result);
    }
    
    
     @Test
    public void tailAndHeadOverlap2() {

        String result = "";

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String tom = "Tom";
        String sam = "Sam";
        String richard = "Richard";
        String mike = "Mike";
        String kelly = "Kelly";
        String jane = "Jane";
        String roger = "Roger";
        String harry = "Harry";

         arrayQueue.enqueue(bob); // slot 0, head is 0 tail is 1
         arrayQueue.dequeue(); // slot 0 is empty, and head is now at 1
         arrayQueue.enqueue(ernie); // slot 1
         arrayQueue.enqueue(cait); // cait is in slot 2
         arrayQueue.enqueue(mary); // mary goes to slot 3
         arrayQueue.enqueue(tom); // tom should be in slot 0
         arrayQueue.enqueue(sam); // sam should be in slot 5
         arrayQueue.enqueue(richard); // richard should be in slot 6
         arrayQueue.enqueue(mike); // mike should be in slot 7
         
         
     

        Iterator itr = arrayQueue.iterator();
        while (itr.hasNext()) {
            result = (String) itr.next();
        }

        Assert.assertEquals("Tom", result);
    }
    
    
    
    
    
    

}
