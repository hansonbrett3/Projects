/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.programsstatementsvariables;

/**
 *
 * @author apprentice
 */
public class ProgramsStatementsVariables {
    public static void main(String[] args)
    {
        int someVariable = 0; //this is a basic single line comment
        
        /*
            This comment spans multiple lines
        */
        
        boolean bTest = false;
        bTest = true;
        char charTest = 'a';
        charTest = '\n';
        
        double dTest = 3.14;
        dTest = 3.45E-85;
        dTest = 3.66d;
        dTest = 5.23f;
        float fTest = (float)dTest;
        
        int iTest = 12345;
        iTest = 0x45FA;
        
        String sTest = "We can write anything we want here!";
        sTest = "\tthis will be a tabbed line\nfollowed by a new line back slash goes here\\";
        
        int doWeInit; //we can declare a variable without initializing it
        
        doWeInit = 21;
        
        
    }
}
