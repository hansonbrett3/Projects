/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ANumberGuessingGame {

    public static void main(String[] args) {

        int yourGuess = 0;
        int myGuess = 0;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        myGuess = random.nextInt(10) + 1;

        System.out.println("I'm thinking of a number from 1 to 10.");

        System.out.print("Your Guess: ");
        yourGuess = sc.nextInt();

        if (myGuess == yourGuess) {
            System.out.println("That's right! My secret numnber was " + myGuess);
        } else {
            System.out.println("Sorry, but I was really thinking of " + myGuess);
        }
    }
}
