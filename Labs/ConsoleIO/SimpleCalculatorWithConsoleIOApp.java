/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecalculatorwithconsoleio;

/**
 *
 * @author apprentice
 */
public class SimpleCalculatorWithConsoleIOApp {

    public static void main(String[] args) {

        ConsoleIO consoleIO = new ConsoleIO();
        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Welcome to Simple Calculator.");

        System.out.println("\nCalculator Operations");
        System.out.println("=====================");
        System.out.println("\t(1) Add");
        System.out.println("\t(2) Subtract");
        System.out.println("\t(3) Multiply");
        System.out.println("\t(4) Divide");
        System.out.println("\t(5) Quit");

        int choice = consoleIO.getIntWithinRange("choice: ", 1, 5);

        do {

            if (choice == 1) {
                calc.setOperand1(consoleIO.getDoubleInput("number: "));
                calc.setOperand2(consoleIO.getDoubleInput("second number: "));
                calc.add();

            } else if (choice == 2) {
                calc.setOperand1(consoleIO.getDoubleInput("number: "));
                calc.setOperand2(consoleIO.getDoubleInput("second number: "));
                calc.subtract();

            } else if (choice == 3) {
                calc.setOperand1(consoleIO.getDoubleInput("number: "));
                calc.setOperand2(consoleIO.getDoubleInput("second number: "));
                calc.multiply();

            } else if (choice == 4) {
                calc.setOperand1(consoleIO.getDoubleInput("number: "));
                calc.setOperand2(consoleIO.getDoubleInput("second number: "));
                calc.divide();

            } else {

            }

            System.out.println("\nCalculator Operations");
            System.out.println("=====================");
            System.out.println("\t(1) Add");
            System.out.println("\t(2) Subtract");
            System.out.println("\t(3) Multiply");
            System.out.println("\t(4) Divide");
            System.out.println("\t(5) Quit");
            if (choice != 5) {
                choice = consoleIO.getIntWithinRange("your choice: ", 1, 5);

            }

        } while (choice != 5);

        System.out.println("Goodbye.");

    }
}
