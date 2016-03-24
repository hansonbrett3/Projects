/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._countingmachinerevisited;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class CountingMachineRevisited {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Count from: ");
        int from = sc.nextInt();

        System.out.print("Count to: ");
        int to = sc.nextInt();

        System.out.print("Count by: ");
        int by = sc.nextInt();
        
        for (int i=from; i<=to;i+=by) {
            System.out.print(i + " ");
        }
    }
}
