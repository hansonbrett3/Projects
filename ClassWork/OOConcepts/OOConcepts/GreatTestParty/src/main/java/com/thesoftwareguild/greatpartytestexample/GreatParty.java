/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.greatpartytestexample;

/**
 *
 * @author apprentice
 */
public class GreatParty {
// party is successful if cigars are between 40 and 60 inclusive
// if weekend is not upper boundary 
    public boolean greatParty(int cigars, boolean isWeekend)
    {
        if (isWeekend)
        {
            if(cigars>=40)
            {
                return true;
            } else
            {
                return false;
            }
        } else 
        {
            if (cigars >=40 && cigars <=60)
            {
               return true; 
            } else {
               return false;
            }
        }   
    }
}
