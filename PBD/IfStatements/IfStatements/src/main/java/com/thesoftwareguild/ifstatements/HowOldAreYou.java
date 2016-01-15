/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ifstatements;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HowOldAreYou {

    public static void main(String[] args) {
        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hey, what's your name? ");
        name = keyboard.next();

        System.out.print("Ok, " + name + " how old are you? ");
        age = keyboard.nextInt();

        if (age < 18) {
            System.out.println("You can't vote, " + name);
        }

        if (age < 16) {
            System.out.println("You can't drive, " + name);
        }

        if (age < 25) {
            System.out.println("You can't rent a car, " + name);
        }

        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name);
        }

    }

}
