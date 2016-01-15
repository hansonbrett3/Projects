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
public class TwentyQuestions {

    public static void main(String[] args) {

        System.out.println("TWO QUESTIONS!");
        System.out.println("Think of an object, and I'll try to guess it.");

        String type = " ";
        String size = " ";
        String result = " ";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
        type = keyboard.next();

        System.out.println("Is it bigger than a breadbox?");
        size = keyboard.next();

        if (type == "animal") {
            if (size == "yes") {
                result = "moose";
            } else if (size == "no") {
                result = "squirrel";
            } else {
                result = "error";
            }
        } else if (type == "vegetable") {
            if (size == "yes") {
                result = "watermelon";
            } else if (size == "no") {
                result = "carrot";
            } else {
                result = "error";
            }
        } else {
            if (size == "yes") {
                result = "Camaro";
            } else if (size == "no") {
                result = "paper clip";
            } else {
                result = "error";
            }
        }

        System.out.println("My guess is you are thinking of a " + result);
        System.out.println("I would ask if I'm right, but I don't actually care.");

    }
}
