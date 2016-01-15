/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.variables;

/**
 *
 * @author apprentice
 */
public class MoreVariablesAndPrinting {

    public static void main(String[] args) {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Zed A. Shaw";
        myAge = 35;
        myHeight = 74;
        myWeight = 180;
        myEyes = "Blue";
        myTeeth = "White";
        myHair = "Brown";

        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's my " + myHeight + " inches tall.");
        System.out.println("He's my " + myWeight + " pounds heavy");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
        System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
        System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + ".");

    }
}
