/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.interfacesexample;

/**
 *
 * @author apprentice
 */
public class ConsoleLogger implements Debuggable {

    @Override
    public void displayStatus(String id) {
        System.out.println("Error: " + id + "means all is well.");
    }

    @Override
    public void displayError(String error) {
        System.out.println("Your system threw an error: " + error);
    }
    
}
