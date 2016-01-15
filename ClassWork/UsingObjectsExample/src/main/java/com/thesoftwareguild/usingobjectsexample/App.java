/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.usingobjectsexample;

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        UsingObjectsExample example = new UsingObjectsExample();
        
        example.add(12.3, 17.2);
        example.add(15, 16);
        
        example.printValues(15, 23.5, true);
        example.printValues(15, 42.7);
    }
    
}
