/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleCalculatorApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Welcome to Simple Calculator.");
        System.out.println("\nPlease enter two numbers: ");

        calc.setOperand1(scan.nextDouble());
        calc.setOperand2(scan.nextDouble());

        System.out.println("Choose what you want to do with them: ");
        System.out.println("\t(1) Add");
        System.out.println("\t(2) Subtract");
        System.out.println("\t(3) Multiply");
        System.out.println("\t(4) Divide");
        System.out.println("\t(5) Quit");

        int choice;

        do {
            choice = scan.nextInt();

            if (choice == 1) {
                calc.add();

            } else if (choice == 2) {
                calc.subtract();

            } else if (choice == 3) {
                calc.multiply();

            } else if (choice == 4) {
                calc.divide();

            }
            else if (choice == 5) {
                
            }
            else {
                System.out.println("You've entered an invalid option.");

            }
            
            if(choice != 5) {

            System.out.println("\nPlease enter two numbers: ");

            calc.setOperand1(scan.nextDouble());
            calc.setOperand2(scan.nextDouble());

            System.out.println("Choose what you want to do with them: ");
            System.out.println("\t(1) Add");
            System.out.println("\t(2) Subtract");
            System.out.println("\t(3) Multiply");
            System.out.println("\t(4) Divide");
            System.out.println("\t(5) Quit");
            }

        } while (choice != 5);
        
        System.out.println("Goodbye.");

    }
}
