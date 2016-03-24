/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._howoldareyouspecifically;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String name = sc.nextLine();
        
        System.out.println("Ok, " + name + ", how old are you ");
        int age = sc.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive");
        } else if (age >= 16 && age <=17) {
            System.out.println("You can drive, but not vote");
        } else if (age >= 18 && age <= 24) {
            System.out.println("You can vote, but not rent a car.");
        } else {
            System.out.println("You can do pretty much anything");
        }
    }
}
