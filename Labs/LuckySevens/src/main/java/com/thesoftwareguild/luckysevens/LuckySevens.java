/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BrettJava
 */
public class LuckySevens {

    public static void main(String[] args) {

        int totalRolls = 0;
        int account = 0;
        Random random = new Random();
        int MAX_MONEY = 0;
        int winnings = 0;
        int MAX_ROLL = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many dollars would you like to bet?");
        int money = sc.nextInt();
        account += money;

        System.out.println("Please hit enter to roll your dice!");
        System.out.println("\n");

        do {

            int diceOne = random.nextInt(6) + 1;
            int diceTwo = random.nextInt(6) + 1;
            int diceSum = diceOne + diceTwo;

            System.out.println("Roll# " + totalRolls);
            System.out.println("You rolled a " + diceSum + " -- (Die 1 = " + diceOne + ", Die 2 = " + diceTwo + ")");

            MAX_MONEY = Math.max(MAX_MONEY, account);

            if (MAX_MONEY == account) {
                MAX_ROLL = totalRolls;

            }

            if (diceSum == 7) {
                System.out.println("You win $4!");
                winnings += 4;
                account += 4;
                totalRolls++;
                System.out.println("Account = $" + account);
                System.out.println();

            } else {
                System.out.println("You lose $1");
                winnings -= 1;
                account -= 1;
                totalRolls++;
                System.out.println("Account = $" + account);
                System.out.println();

            }

        } while (account > 0);
        
        MAX_ROLL -= 1;

        System.out.println("Sorry, you don't have anymore money to play with");
        System.out.println("The most money you had was at roll# " + MAX_ROLL + " amd you had $" + MAX_MONEY);

    }
}