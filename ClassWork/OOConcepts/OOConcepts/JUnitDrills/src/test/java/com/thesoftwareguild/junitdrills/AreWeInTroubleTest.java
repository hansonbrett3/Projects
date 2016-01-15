/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.junitdrills;

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
public class AreWeInTroubleTest {
    public AreWeInTrouble myTrouble;
    
    public AreWeInTroubleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        myTrouble = new AreWeInTrouble();
    }
    
    @After
    public void tearDown() {
    }
    
    
    
    @Test
    public void AreWeInTroubleYetTest()
    {
        boolean result;
        result = myTrouble. AreWeInTrouble (true);
        Assert.assertEquals(true, result);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

//We have two children, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
//
//AreWeInTrouble(true, true) -> true
//AreWeInTrouble(false, false) -> true
//AreWeInTrouble(true, false) -> false
//
//public boolean AreWeInTrouble(boolean aSmile, boolean bSmile) {
//  
//}
