/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    public int getInteger(String prompt) throws Exception {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(prompt);
            try {
                int i = Integer.parseInt(sc.next());
                return i;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
            }
        }

    }

    public int getInteger(String prompt, int min, int max) throws Exception {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println(prompt);
            try {
                int input = Integer.parseInt(sc.next());
                while (input < min || input > max) {
                    System.out.println("Please enter an integer between " + min + " and " + max + ", inclusive:");
                    input = Integer.parseInt(sc.next());
                }
                return input;
            } catch (Exception e) {
                System.out.println("Please enter an integer.");
            }
        }

    }

    public String getString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public float getFloat(String prompt) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            try {
                float input = Float.parseFloat(sc.next());
                return input;
            } catch (Exception e) {
                System.out.println("Please enter a float.");
            }
        }

    }

    public float getFloat(String prompt, float min, float max) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            try {
                float input = Float.parseFloat(sc.next());
                while (input < min || input > max) {
                    System.out.println("Please enter an float between " + min + " and " + max + ", inclusive:");
                    input = Float.parseFloat(sc.next());
                }
                return input;
            } catch (Exception e) {
                System.out.println("Please enter a float.");
            }
        }
    }

    public double getDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            try {
                double input = Double.parseDouble(sc.next());
                return input;
            } catch (Exception e) {
                System.out.println("Please enter a double.");
            }
        }
    }

    public double getDouble(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        while (true) {
            try {
                double input = Double.parseDouble(sc.next());
                while (input < min || input > max) {
                    System.out.println("Please enter an double between " + min + " and " + max + ", inclusive:");
                    input = Double.parseDouble(sc.next());
                }
                return input;
            } catch (Exception e) {
                System.out.println("Please enter a double.");
            }
        }
    }

    public void printString(String prompt) {
        Scanner sc = new Scanner(System.in);

        System.out.println(prompt);
        System.out.println(sc.nextLine());

    }

    public void print(String s) {
        System.out.println(s);
    }

    public LocalDate getADate(String prompt) throws Exception {
        LocalDate output;
        String dateString;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        while (true) {
            try {
                dateString = getString(prompt);
                output = LocalDate.parse(dateString, formatter);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                print("Date format was invalid. Please try again.");
            }
        }

        return output;

    }
}
