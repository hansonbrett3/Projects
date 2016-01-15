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
public class MoreUserInputData {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String lastName;
        int grade;
        double studentID;
        String login;
        double GPA;

        System.out.println("Please enter the following information so I can sell it for a profit!");

        System.out.print("First name: ");
        firstName = keyboard.next();

        System.out.print("Last name: ");
        lastName = keyboard.next();

        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();

        System.out.print("Student ID: ");
        studentID = keyboard.nextDouble();

        System.out.print("Login: ");
        login = keyboard.next();

        System.out.print("GPA (0.0-4.0): ");
        GPA = keyboard.nextDouble();

        System.out.println("Your information: ");
        System.out.println("     Login: " + login);
        System.out.println("     ID: " + studentID);
        System.out.println("     Name: " + lastName + ", " + firstName);
        System.out.println("     GPA: " + GPA);
        System.out.println("     Grade: " + grade);
    }

}
