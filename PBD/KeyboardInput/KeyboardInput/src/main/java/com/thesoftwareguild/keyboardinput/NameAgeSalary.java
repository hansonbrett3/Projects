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
public class NameAgeSalary {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("Hi, " + name + " ! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + " That's not old at all!");
        System.out.println("How much do you make " + name + " ?");
        salary = keyboard.nextDouble();

        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}
