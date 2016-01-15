/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.greatpartytestexample;

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
public class GreatPartyUnitTest {
    
    private GreatParty myParty;
    
    public GreatPartyUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        myParty = new GreatParty();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //greatParty(30, false) => false
    //greatParty(50, false) => true
    // greatParty(70, true) => true
    
    
    @Test
    public void GreatParty30CigarsWeekdayTest()
    {
        
        boolean result;
        result = myParty.greatParty(30, false);
        
        Assert.assertFalse(result);
    }
    
    @Test
    public void GreatParty50cigarsWeekdayTest()
    {
        //set
        //GreatParty myParty = new GreatParty();
        boolean result;
        //act
        result = myParty.greatParty(50, false);
        
        //assert
        Assert.assertTrue(result);
    }
    
    @Test
    public void GreatParty70CigarsWeekendTest()
    {
        boolean result;
        //act
        result = myParty.greatParty(70, true);
        
        //asert
        Assert.assertTrue(result);
    }
}

