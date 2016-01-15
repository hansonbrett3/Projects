/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.rockpaperscissors;

/**
 *
 * @author apprentice
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsStep1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random math = new Random();

        int userNumber;
        int compNumber;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Please type in your choice on the count of 3!");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        System.out.println("Rock Paper Scissors 1...2...3...");
        userNumber = sc.nextInt();

        compNumber = math.nextInt(3) + 1;

        if (userNumber == 1) {
            String userChoice = "ROCK";
            System.out.println("You choose " + userChoice);
            if (compNumber == 1) {
                String compChoice = "ROCK";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println("You tie!");
            } else if (compNumber == 2) {
                String compChoice = "PAPER";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(compChoice + " covers " + userChoice + " you lose");
            } else {
                String compChoice = "SCISSORS";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(userChoice + " crushes " + compChoice + " YOU WIN!!!");
            }
        } else if (userNumber == 2) {
            String userChoice = "PAPER";
            System.out.println("You choose " + userChoice);
            if (compNumber == 1) {
                String compChoice = "ROCK";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(userChoice + " covers " + compChoice + " YOU WIN!!!");
            } else if (compNumber == 2) {
                String compChoice = "PAPER";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println("You tie!");
            } else {
                String compChoice = "SCISSORS";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(compChoice + " cuts " + userChoice + " you lose");
            }
        } else if (userNumber == 3) {
            String userChoice = "SCISSORS";
            System.out.println("You choose " + userChoice);
            if (compNumber == 1) {
                String compChoice = "ROCK";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(compChoice + " crushes " + userChoice + " you lose");
            } else if (compNumber == 2) {
                String compChoice = "PAPER";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println(userChoice + " cuts " + compChoice + " YOU WIN!!!");
            } else {
                String compChoice = "SCISSORS";
                System.out.println("The computer chooses: " + compChoice);
                System.out.println("You tie!");
            }
        }
    }
}
