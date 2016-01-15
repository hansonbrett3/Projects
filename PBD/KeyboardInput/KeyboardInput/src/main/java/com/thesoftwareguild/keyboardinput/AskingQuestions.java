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
public class AskingQuestions {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String height;
        double weight;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.println("How tall are you? ");
        height = keyboard.next();

        System.out.println("How much do you weight ");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + height + " tall and " + weight + " heavy.");

    }

}
