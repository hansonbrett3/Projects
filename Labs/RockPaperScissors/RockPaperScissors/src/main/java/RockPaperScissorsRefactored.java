
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BrettJava
 */
public class RockPaperScissorsRefactored {

    public static void main(String[] args) {

        String userChoice;
        String compChoice;

        Scanner sc = new Scanner(System.in);
        Random math = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors (Refactored)");

        System.out.println("How many games woulf you like to play? Maximum number is 10");
        int numGames = sc.nextInt();

        if (numGames < 1 || numGames > 10) {
            System.out.println("Please enter a valid number");
        } else {
            System.out.println("Please enter the number below that corresponds with your selection");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            int userNumber = sc.nextInt();

            int compNumber = math.nextInt(3) + 1;

            switch (userNumber) {
                case 1:
                    userChoice = "Rock";
                    break;
                case 2:
                    userChoice = "Paper";
                    break;
                case 3:
                    userChoice = "Scissors";
                    break;
                default:
                    userChoice = "Invalid input";
                    break;
            }

            switch (compNumber) {
                case 1:
                    compChoice = "Rock";
                    break;
                case 2:
                    compChoice = "Paper";
                    break;
                case 3:
                    compChoice = "Scissors";
                    break;
                default:
                    compChoice = "Invalid input";
                    break;
            }

            System.out.println("You choose " + userChoice + " The computer chooses " + compChoice);

            if ((userChoice == "Rock" && compChoice == "Rock") || (userChoice == "Paper" && compChoice == "Paper") || (userChoice == "Scissors" && compChoice == "Scissors")) {
                System.out.println("You Tie!");
            } else if ((userChoice == "Rock" && compChoice == "Scissors") || (userChoice == "Paper" && compChoice == "Rock") || (userChoice == "Scissors" && compChoice == "Paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("Sorry, you Lose");
            }
        }
    }
}
