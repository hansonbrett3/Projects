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

public class PrimeFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Prime Finder!");
        System.out.println("In this game, you can enter any number (greater than zero) and it will automatically"
                + "calculate if the number is prime ");

        int userNumber = 0;
        int totalPrime = 0;

        System.out.println("Please type in a number greater than zero");
        userNumber = sc.nextInt();

        System.out.println("Factors of " + userNumber + " are: ");

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                if (userNumber == i) {
                    totalPrime = totalPrime + i;
                } else if (userNumber % i == 0) {
                    System.out.println(i);
                    totalPrime = totalPrime + i;
                }
            }
            if (totalPrime == userNumber + 1) {
                System.out.println(userNumber + " is a prime");
            } else {
                System.out.println(userNumber + " is not a prime");
            }
        } else {
            System.out.println("Sorry, that number is invalid. Please choose another one.");
        }
    }
}
// Display explanation of program to user
// Ask user for a number
// Ensures that number is larger than 0 and keeps asking the user for input until number is valid
// Find and display all prime numbers between 0 and number
// Display number of primes found
// Ask if user wants to find primes again. 