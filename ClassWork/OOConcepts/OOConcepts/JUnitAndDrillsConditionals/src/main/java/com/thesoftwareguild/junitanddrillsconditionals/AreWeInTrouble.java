/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.thesoftwareguild.junitanddrillsconditionals;

/**
 *
 * @author apprentice
 */
public class AreWeInTrouble {
    
    public boolean AreWeInTrouble(boolean, aSmile, boolean bSmile)
    {
        if (aSmile == true && bSmile == true)
        {
            return true;
        }
    }
    
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
