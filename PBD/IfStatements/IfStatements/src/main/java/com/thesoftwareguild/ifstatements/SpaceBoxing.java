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
public class SpaceBoxing {

    public static void main(String[] args) {

        double userWeight = 0;
        int planetNumber = 0;
        double targetWeight = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your current weight: ");
        userWeight = sc.nextDouble();

        System.out.println("I have information on the following planets: ");
        System.out.println("     1. Venus   2. Mars    3. Jupiter");
        System.out.println("     4. Saturn  5. Uranus  6. Neptune");

        System.out.println("What Planet are you visiting? ");
        planetNumber = sc.nextInt();

        if (planetNumber == 1) {
            targetWeight = 0.78 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else if (planetNumber == 2) {
            targetWeight = 0.39 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else if (planetNumber == 3) {
            targetWeight = 2.65 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else if (planetNumber == 4) {
            targetWeight = 1.17 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else if (planetNumber == 5) {
            targetWeight = 1.05 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else if (planetNumber == 6) {
            targetWeight = 1.23 * userWeight;
            System.out.println("Your weight would be " + targetWeight + " pounds on that planet");
        } else {
            System.out.println("ERROR");
        }

    }

}
