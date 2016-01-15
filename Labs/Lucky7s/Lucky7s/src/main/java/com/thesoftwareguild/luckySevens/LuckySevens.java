/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.luckySevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class LuckySevens {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random gen = new Random();

        int dieTwo;
        int dieOne;
        double account=0;
        double MAX_MONEY = 0;
        int rolls = 0;
        int rollAtMax = 0;
        
        System.out.println("How many dollars do you have to bet?");
        double money = sc.nextDouble();
        account += money;
        System.out.println();

        while (money > 0) {
            dieOne = gen.nextInt(6) + 1;
            dieTwo = gen.nextInt(6) + 1;
            rolls++;

            int dieSum = dieOne + dieTwo;

            System.out.println("Roll# " + rolls);
            System.out.println("Die 1: " + dieOne);
            System.out.println("Die 2: " + dieTwo);
            System.out.println("Total: " + dieSum);
            System.out.println("---------------------------------------------");

            if (dieOne + dieTwo == 7) {
                System.out.println("YOU WIN: $4");
                money += 4;
                System.out.println("Account = $" + money);

            } else {
                System.out.println("YOU LOSE: $1");
                money--;
                System.out.println("Account = $" + money);

            }

            if (money > MAX_MONEY && rolls > 0) {
                MAX_MONEY = money;
                rollAtMax = rolls;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();

        }
        System.out.println("Game Statistics:");
        System.out.println("Total # of Rolls = " + rolls);
        System.out.println("Maximum Money: $" + MAX_MONEY + " at Roll #" + rollAtMax);
    }

}