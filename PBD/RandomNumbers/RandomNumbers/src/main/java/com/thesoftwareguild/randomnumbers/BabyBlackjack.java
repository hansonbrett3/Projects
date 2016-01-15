/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.randomnumbers;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BabyBlackjack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random deal = new Random();

        int playerCard1;
        int playerCard2;
        int dealerCard1;
        int dealerCard2;
        int playerTotal;
        int dealerTotal;

        System.out.println("Baby Blackjack");

        playerCard1 = deal.nextInt(10) + 1;
        playerCard2 = deal.nextInt(10) + 1;

        playerTotal = playerCard1 + playerCard2;

        System.out.println("You drew " + playerCard1 + " and " + playerCard2);
        System.out.println("Your total is " + playerTotal);

        dealerCard1 = deal.nextInt(9) + 1;
        dealerCard2 = deal.nextInt(9) + 1;

        dealerTotal = dealerCard1 + dealerCard2;

        System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2);
        System.out.println("The dealer's total is " + dealerTotal);

        if (playerTotal > dealerTotal) {
            System.out.println("YOU WIN!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("YOU LOSE");
        } else {
            System.out.println("YOU TIE");
        }
    }
}
