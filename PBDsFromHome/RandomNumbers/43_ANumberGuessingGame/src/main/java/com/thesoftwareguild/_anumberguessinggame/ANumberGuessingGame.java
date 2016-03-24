/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._anumberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class ANumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("I'm thinking of a number from 1 to 10 ");
        System.out.println();
        
        int random = r.nextInt(10);
        
        System.out.print("Your Guess: ");
        int guess = sc.nextInt();
        
        if (random == guess) {
            System.out.println("That's right! My secret number was " + random);
        } else {
            System.out.println("Sorry, but I was really thinking of " + random);
        }
        
        
    }
}
