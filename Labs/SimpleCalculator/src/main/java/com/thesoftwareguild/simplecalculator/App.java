/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecalculator;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        ConsoleIO consoleIO = new ConsoleIO();
        System.out.println("Your integer is " + consoleIO.getIntInput("integer"));

        System.out.println("Your integer between 1 and 10 is " + consoleIO.getIntWithinRange("integer within range 1 and 10", 1, 10));

        System.out.println("Your float is " + consoleIO.getFloatInput("float"));

        System.out.println("Your float between 10.25 and 50.75 is " + consoleIO.getFloatWithinRange("float within range 10.25 and 50.75", 10.25f, 50.75f));
        
        System.out.println("Your double is " + consoleIO.getDoubleInput("double"));

        System.out.println("Your double between 1.0 and 100.0 is " + consoleIO.getDoubleWithinRange("double within range 1.0 and 100.0", 1.0, 100.0));
    }
}
