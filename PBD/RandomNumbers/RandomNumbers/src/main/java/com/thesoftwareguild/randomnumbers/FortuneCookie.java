/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.randomnumbers;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FortuneCookie {

    public static void main(String[] args) {

        String response = "";

        Random r = new Random();
        int randomNumber = r.nextInt(6) + 1;

        if (randomNumber == 1) {
            response = "You will be happy";
        } else if (randomNumber == 2) {
            response = "You will not be happy";
        } else if (randomNumber == 3) {
            response = "You will win";
        } else if (randomNumber == 4) {
            response = "You will lose";
        } else if (randomNumber == 5) {
            response = "You will succeed";
        } else {
            response = "You will not succeed";
        }

        System.out.println("Fortune Cookie Says: " + response);
    }
}
