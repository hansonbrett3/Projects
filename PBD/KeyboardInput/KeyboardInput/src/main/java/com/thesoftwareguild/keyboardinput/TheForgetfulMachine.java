/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.keyboardinput;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TheForgetfulMachine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String word;
        String secondWord;

        System.out.println("Give me word!");
        word = keyboard.next();

        System.out.println("Give me a second word!");
        secondWord = keyboard.next();

        int favNumber;
        int secondNumber;

        System.out.println("Great, now your favorite number?");
        favNumber = keyboard.nextInt();

        System.out.println("And your second favorite number...");
        secondNumber = keyboard.nextInt();

        System.out.println("Whew! Wasn't that fun?");

    }
}
