/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Blackjack {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int userTotal = 0;
        int compTotal = 0;
        
        System.out.println("Welcome to Brett's Blackjack game");
        
        int userFirst = r.nextInt(10)+2;
        userTotal += userFirst;
        System.out.println("First Card: " + userFirst);
        
        int userSecond = r.nextInt(10)+2;
        userTotal += userSecond;
        System.out.println("Second Card: " + userSecond);
        
        System.out.println("Total: " + userTotal);
        
        if(userTotal>21){
            System.out.println("You Busted!");
        }
        
        int compOne = r.nextInt(10)+2;
        compTotal += compOne;
        int compTwo = r.nextInt(10)+2;
        compTotal += compTwo;
        System.out.println("Dealer's First Card: " + compOne);
        System.out.println("The Second card is hidden.....");
        
        System.out.println("Would you like to hit?(\"Y/N\")");
        
        
    }
    }