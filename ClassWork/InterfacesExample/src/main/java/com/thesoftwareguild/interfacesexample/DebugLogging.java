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
public interface DebugLogging extends Debuggable{
    public void logStatus(String id);
    public void logError(String error);
}
