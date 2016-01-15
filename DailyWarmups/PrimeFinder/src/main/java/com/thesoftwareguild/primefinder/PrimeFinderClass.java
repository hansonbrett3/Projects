/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.primefinder;

/**
 *
 * @author apprentice
 */
import java.util.Scanner;

public class PrimeFinderClass {

    public static void main(String[] args) {
        System.out.println("This program find all prime number between 0 and a number of your choice.");
        Scanner sc = new Scanner(System.in);
        String userContinue = "";
        int numberOfRuns = 0;
        do {
            int value = 0;
            String valueString = "";
            while (value <= 0) {
                System.out.println("Please enter a desired number greater than 0:0");
                valueString = sc.nextLine();
                value = Integer.parseInt(valueString);
                
            }

            int primeCount = 0;
            boolean primeFound = true;
            for (int i = 1; i <= value; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeFound = false;
                    }
                }
                if (primeFound) {
                    System.out.println("Prime Found:" + i);
                    primeCount++;
                }
                primeFound = true;
            }

            System.out.println("Prime number count is " + primeCount);
            numberOfRuns++;
            System.out.println("Would you like to enter another number(y/n)?");
            userContinue = sc.nextLine();
        } while (userContinue.equalsIgnoreCase("y"));

        System.out.println("Thank you for using our product. You found primes " + numberOfRuns + " times.");
    }

}
