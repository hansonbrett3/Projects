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
public class Magic8Ball {
    
    public static void main(String[] args) {
        Random r = new Random();
        
        int choice = 1 + r.nextInt(15);
        String response = "";
        
        if (choice == 1)
        {
            response = "It is certain";
        }
        else if (choice == 2)
        {
            response = "It is certain";
        }
        else if (choice == 3)
        {
            response = "It is certain";
        }
        else if (choice == 4)
        {
            response = "Without a doubt";
        }
        else if (choice == 5)
        {
            response = "Nice man";
        }
        else if (choice == 6)
        {
            response = "No doubt";
        }
        else if (choice == 7)
        {
            response = "For sure";
        }
        else if (choice == 8)
        {
            response = "It is certain";
        }
        else if (choice == 9)
        {
            response = "Most Likely";
        }
        else if (choice == 10)
        {
            response = "Outlook good";
        }
        else if (choice == 11)
        {
            response = "Signs point to yes";
        }
        else if (choice == 12)
        {
            response = "Reply hazy, try again";
        }
        else if (choice == 13)
        {
            response = "Ask again later";
        }
        else if (choice == 14)
        {
            response = "Better not tell you now";;
        }
        else if (choice == 15)
        {
            response = "Cannot predict now";
        }
        else
        {
            response = "8-BALL ERROR!";
        }
        
        System.out.println("MAGIC 8-BALL SAYS: " + response );
    }
}   
