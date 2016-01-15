/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brett
 */
public class RockPaperScissorsStep4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random math = new Random();

        int userNumber;
        int compNumber;
        int ties = 0;
        int userWins = 0;
        int compWins = 0;
        int playAgain = 1;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            System.out.println("How many rounds would you like to play! (Maximum number is 10 rounds)");
            int numRounds = sc.nextInt();

            int roundsPlayed = 0;

            if (numRounds < 11 && numRounds > 0) {

                if (numRounds >= 1 || numRounds <= 10) {
                    System.out.println("Please type in your choice by entering the corresponding number");
                    System.out.println("1 = Rock");
                    System.out.println("2 = Paper");
                    System.out.println("3 = Scissors");

                    do {
                        System.out.println("User Choice: ");
                        userNumber = sc.nextInt();
                        roundsPlayed++;

                        compNumber = math.nextInt(3) + 1;

                        if (userNumber < 1 || userNumber > 3) {
                            System.out.println("Please enter a valid number");
                        } else if (userNumber == 1) {
                            System.out.println("---------------------------------");
                            System.out.println("Round #" + roundsPlayed);

                            String userChoice = "ROCK";
                            System.out.println("You choose " + userChoice);
                            if (compNumber == 1) {
                                String compChoice = "ROCK";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println("You tie!");
                                ties++;
                            } else if (compNumber == 2) {
                                String compChoice = "PAPER";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(compChoice + " covers " + userChoice + " you lose");
                                compWins++;
                            } else {
                                String compChoice = "SCISSORS";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(userChoice + " crushes " + compChoice + " YOU WIN!!!");
                                userWins++;
                            }
                        } else if (userNumber == 2) {
                            System.out.println("---------------------------------");
                            System.out.println("Round #" + roundsPlayed);

                            String userChoice = "PAPER";
                            System.out.println("You choose " + userChoice);
                            if (compNumber == 1) {
                                String compChoice = "ROCK";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(userChoice + " covers " + compChoice + " YOU WIN!!!");
                                userWins++;
                            } else if (compNumber == 2) {
                                String compChoice = "PAPER";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println("You tie!");
                                ties++;
                            } else {
                                String compChoice = "SCISSORS";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(compChoice + " cuts " + userChoice + " you lose");
                                compWins++;
                            }
                        } else {
                            System.out.println("---------------------------------");
                            System.out.println("Round #" + roundsPlayed);

                            String userChoice = "SCISSORS";
                            System.out.println("You choose " + userChoice);
                            if (compNumber == 1) {
                                String compChoice = "ROCK";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(compChoice + " crushes " + userChoice + " you lose");
                                compWins++;
                            } else if (compNumber == 2) {
                                String compChoice = "PAPER";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println(userChoice + " cuts " + compChoice + " YOU WIN!!!");
                                userWins++;
                            } else {
                                String compChoice = "SCISSORS";
                                System.out.println("The computer chooses: " + compChoice);
                                System.out.println("You tie!");
                                ties++;
                            }
                        }
                    } while (numRounds > roundsPlayed);
                    System.out.println("-----------------------------------------");
                    System.out.println("Tied: " + ties);
                    System.out.println("Won: " + userWins);
                    System.out.println("Lost: " + compWins);

                    if (userWins > compWins) {
                        System.out.println("YOU WIN!!");
                    } else if (userWins == compWins) {
                        System.out.println("You tied the computer");
                    } else {
                        System.out.println("Sorry, Maybe next time");
                    }

                    System.out.println("-----------------------------------------");

                    System.out.println("Enter 1 to play again or 2 to quit");
                    playAgain = sc.nextInt();
                }
            } else {
                System.out.println("ERROR: A valid number between 1 and 10 is needed to play");
            }
        } while (playAgain == 1);
        System.out.println("Thanks for playing");
    }
}
