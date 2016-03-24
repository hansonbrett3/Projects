/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._countingmachine;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class CountingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Count to: ");
        int number = sc.nextInt();
        
        for (int i=0; i<=number; i++)
        {
            System.out.print(i + " ");
        }
    }
}
