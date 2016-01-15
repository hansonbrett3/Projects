/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.factorizer;

/**
 *
 * @author apprentice
 */
import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = 0;
        int factorSum = 0;
        int count = 0;

        System.out.println("LAB #3: FACTORIZER");
        System.out.print("What number would you like to factor? ");
        userInput = sc.nextInt();
        System.out.println("The factors of " + userInput + " are: ");

        for (int i = 1; i <= userInput; i++) {

            if (userInput % i == 0) {
                System.out.println(i);
                count++;
                factorSum = factorSum + i;
            }

        }
        System.out.println("There are a total of " + count + " factors of " + userInput);
        
        
        if ((factorSum - userInput) == userInput) {
            System.out.println(userInput + " is a perfect number");
        }
        else {
            System.out.println(userInput + " is not a perfect number");
        }
        
        
        if (factorSum == userInput + 1) {
            System.out.println(userInput + " is a prime number");
        } else {
            System.out.println(userInput + " is not a prime number");
        }
    }
}

