/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.whileloops;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class DiceDoubles {

    public static void main(String[] args) {
        System.out.println("HERE COMES THE DICE!");
        System.out.println("");

        Random r = new Random();

        int rollOne = r.nextInt(6) + 1;
        int rollTwo = r.nextInt(6) + 1;
        int rollTotal = rollOne + rollTwo;

        while (rollOne != rollTwo) {

            rollOne = r.nextInt(6) + 1;
            rollTwo = r.nextInt(6) + 1;
            rollTotal = rollOne + rollTwo;

            System.out.println("Roll#1: " + rollOne);
            System.out.println("Roll#2: " + rollTwo);
            System.out.println("The Total is: " + rollTotal + "!");
            System.out.println("");
        }

    }
}
