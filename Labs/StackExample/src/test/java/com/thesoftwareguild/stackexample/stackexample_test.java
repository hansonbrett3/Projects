/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.stackexample;

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
 * @author Jonathan Chiou and Brett Hanson
 */
public class stackexample_test {
    
    ArrayStack arrayStack;
    
    public stackexample_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        arrayStack = new ArrayStack();
       
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    public void pushIncreaseArrayTest(){
        
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayStack.push(bob);
        arrayStack.push(ernie);
        arrayStack.push(cait);
        arrayStack.push(mary);
        arrayStack.push(jon);
        
        int numItems = arrayStack.size();
        
        Assert.assertEquals(5, numItems);
        
    }
    
    
    @Test
    public void popTest(){
        
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayStack.push(bob);
        arrayStack.push(ernie);
        arrayStack.push(cait);
        arrayStack.push(mary);
        arrayStack.push(jon);
        
        arrayStack.pop();
        arrayStack.pop();
        
        int numItems = arrayStack.size();
        
        Assert.assertEquals(3, numItems);
        
    }
    
    @Test
    public void popJonTest(){
        
        String result;
        
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayStack.push(bob);
        arrayStack.push(ernie);
        arrayStack.push(cait);
        arrayStack.push(mary);
        arrayStack.push(jon);
        
        arrayStack.pop();
       
        Iterator itr = arrayStack.iterator();
        result = (String) itr.next();
                
        
        Assert.assertEquals("Mary", result);
        
    }
    
    @Test
    public void bobAtEndOfIterator(){
        
        String result = "";
        
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayStack.push(bob);
        arrayStack.push(ernie);
        arrayStack.push(cait);
        arrayStack.push(mary);
        arrayStack.push(jon);
        
        arrayStack.pop();
       
        Iterator itr = arrayStack.iterator();
        while(itr.hasNext()){
        result = (String) itr.next();
        }
        
        Assert.assertEquals("Bob", result);
        
    }
    
     @Test
    public void emptyArrayTest(){
        
        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String jon = "Jon";

        arrayStack.push(bob);
        arrayStack.push(ernie);
        arrayStack.push(cait);
        arrayStack.push(mary);
        arrayStack.push(jon);
        
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        
        boolean emptyArray = arrayStack.isEmpty();
        
        Assert.assertTrue(emptyArray);
        
    }
    
    
}
