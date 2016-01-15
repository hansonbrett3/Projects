/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dowhileloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WhileSwimming {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS";

        double minimumTemperature = 79.0; // degrees Farenheit
        double currentTemperature;
        double savedTemperature;
        int swimTime;

        System.out.println("What is the current water temperature? ");
        currentTemperature = keyboard.nextDouble();
        savedTemperature = currentTemperature;  // saves a copy of this value so we can get it back later.

        System.out.println("\nOkay, so the current water temperature is " + currentTemperature + "F.");
        System.out.println(swimmer1 + " approaches the lake....");

        swimTime = 0;
        while (currentTemperature >= minimumTemperature) {
            System.out.println("\t" + swimmer1 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");

            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");

        }

        System.out.println(swimmer1 + "stops swimming. Total swim time: " + swimTime + "min.");
        currentTemperature = savedTemperature; // restores original water temperature

        System.out.println("\nOkay the current water temperature is " + currentTemperature + "F.");
        System.out.println(swimmer2 + " approaches the lake....");

        swimTime = 0;
        do {
            System.out.println("\t" + swimmer2 + " swims for a bit.");
            swimTime++;
            System.out.println(" Swim time: " + swimTime + " min.");

            currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");
        } while (currentTemperature >= minimumTemperature);
        System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min.");
    }

}
