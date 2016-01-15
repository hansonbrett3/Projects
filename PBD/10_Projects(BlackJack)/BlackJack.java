/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.blackjack;

/**
 *
 * @author apprentice
 */
import java.util.Scanner;
import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {

        int userCard1;
        int userCard2;
        int userTotal;
        int dealerCard1;
        int dealerCard2;
        int dealerTotal;
        String userAnswer;
        int userDecision;

        Random deal = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Brett's blackjack game!");
        System.out.println("");
        System.out.println("Hit enter when you would like to be dealt");

        userCard1 = deal.nextInt(10) + 1;
        userCard2 = deal.nextInt(10) + 1;
        userTotal = userCard1 + userCard2;


        System.out.println("You drew a " + userCard1 + " and a " + userCard2);
        System.out.println("Your total is " + userTotal);

        dealerCard1 = deal.nextInt(10) + 1;
        dealerCard2 = deal.nextInt(10) + 1;
        dealerTotal = dealerCard1 + dealerCard2;

        System.out.println("The dealer has a " + dealerCard1 + " along with another hidden card");
        System.out.println("His total is hidden as well");
        
        System.out.println("Would you like to \"hit\" or \"stay\")");
        userAnswer = sc.nextLine();
        
        
        


            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        // do while
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       
    }

}

//Don't worry about suits or face cards; "cards" will have values from 2-11, and all values are equally likely (that is, unlike a real blackjack game, there's no greater chance of drawing a card with value 10).
//Draw two cards for the player and display them.
//Draw two cards for the "dealer" and display one of them, keeping the other one hidden.
//Allow the player to "hit" as many times as he would like.
//If the player "busts" (gets a total over 21), the dealer automatically wins.
//Allow the dealer to hit as many times as he would like. Dealer should probably hit on sixteen or lower.
//If the dealer busts, the player automatically wins.
//Assuming no one has busted, the player with the highest total wins. Dealer wins all ties.
