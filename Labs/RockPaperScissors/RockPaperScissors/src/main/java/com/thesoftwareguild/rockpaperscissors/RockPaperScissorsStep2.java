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

public class RockPaperScissorsStep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random math = new Random();

        int userNumber;
        int compNumber;
        int roundsPlayed = 1;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("How many rounds would you like to play! (Maximum number is 10 rounds)");
        int numRounds = sc.nextInt();

        if (numRounds < 11 && numRounds > 0) {

            if (numRounds >= 1 || numRounds <= 10) {
                System.out.println("Please type in your choice by entering the corresponding number");
                System.out.println("1 = Rock");
                System.out.println("2 = Paper");
                System.out.println("3 = Scissors");
                System.out.println("------------------------------");

                do {
                    System.out.println("User Choice: ");
                    userNumber = sc.nextInt();

                    compNumber = math.nextInt(3) + 1;

                    if (userNumber < 1 || userNumber > 3) {
                        System.out.println("Please enter a valid number");
                    } else if (userNumber == 1) {
                        System.out.println("Round #" + roundsPlayed);
                        roundsPlayed++;
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
                        System.out.println("Round #" + roundsPlayed);
                        roundsPlayed++;
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
                    } else {
                        System.out.println("Round #" + roundsPlayed);
                        roundsPlayed++;
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
                } while (numRounds >= roundsPlayed);

                System.out.println("You reached your limit. Goodbye!");
            }
        } else {
            System.out.println("ERROR: A valid number between 1 and 10 is needed to play");
        }
    }
}

//
//2. In this Step, you will add code that does the following:
//3. Asks the user how many rounds he/she wants to play.
//4. Maximum number of rounds = 10, minimum number of rounds = 1. If the user asks
//for something outside this range, the program prints and error message and quits.
//5. If the number of round is in range, the program plays that 
//
//public class RockPaperScissorsStep1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random math = new Random();
//
//        int userNumber;
//        int compNumber;
//
//        System.out.println("Welcome to Rock, Paper, Scissors!");
//        System.out.println("Please type in your choice on the count of 3!");
//        System.out.println("1 = Rock");
//        System.out.println("2 = Paper");
//        System.out.println("3 = Scissors");
//
//        System.out.println("Rock Paper Scissors 1...2...3...");
//        userNumber = sc.nextInt();
//
//        compNumber = math.nextInt(3) + 1;
//
//        if (userNumber == 1) {
//            String userChoice = "ROCK";
//            System.out.println("You choose " + userChoice);
//            if (compNumber == 1) {
//                String compChoice = "ROCK";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println("You tie!");
//            } else if (compNumber == 2) {
//                String compChoice = "PAPER";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(compChoice + " covers " + userChoice + " you lose");
//            } else {
//                String compChoice = "SCISSORS";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(userChoice + " crushes " + compChoice + " YOU WIN!!!");
//            }
//        } else if (userNumber == 2) {
//            String userChoice = "PAPER";
//            System.out.println("You choose " + userChoice);
//            if (compNumber == 1) {
//                String compChoice = "ROCK";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(userChoice + " covers " + compChoice + " YOU WIN!!!");
//            } else if (compNumber == 2) {
//                String compChoice = "PAPER";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println("You tie!");
//            } else {
//                String compChoice = "SCISSORS";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(compChoice + " cuts " + userChoice + " you lose");
//            }
//        } else if (userNumber == 3) {
//            String userChoice = "SCISSORS";
//            System.out.println("You choose " + userChoice);
//            if (compNumber == 1) {
//                String compChoice = "ROCK";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(compChoice + " crushes " + userChoice + " you lose");
//            } else if (compNumber == 2) {
//                String compChoice = "PAPER";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println(userChoice + " cuts " + compChoice + " YOU WIN!!!");
//            } else {
//                String compChoice = "SCISSORS";
//                System.out.println("The computer chooses: " + compChoice);
//                System.out.println("You tie!");
