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


public class PersistentConsoleLogger implements DebugLogging {

    @Override
    public void logStatus(String id) {
        System.out.println("This status " + id + "can be persisted.");
    }

    @Override
    public void logError(String error) {
        System.out.println("This error  " + error  + "can be persisted.");
    }

    @Override
    public void displayStatus(String id) {
        System.out.println("Persisting status: " + id);
    }

    @Override
    public void displayError(String error) {
        System.out.println("Persisting error: " + error);
    }
    
}
