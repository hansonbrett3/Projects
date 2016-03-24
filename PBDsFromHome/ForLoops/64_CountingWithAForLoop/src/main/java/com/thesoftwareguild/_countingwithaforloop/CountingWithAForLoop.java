/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._countingwithaforloop;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class CountingWithAForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.println("Message: ");
        String message = sc.nextLine();

        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println(i + ". " + message);
        }
    }
}
