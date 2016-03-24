/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.alittledatabaseisshorterwithaloop;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class LilDatabaseLoop {

    public static void main(String[] args) throws Exception {
        Student[] studentBook = new Student[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            studentBook[i] = new Student();

            System.out.print("Enter student " + (i + 1) + "'s name: ");
            studentBook[i].name = sc.next();

            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            studentBook[i].grade = sc.nextInt();

            System.out.print("Enter student " + (i + 1) + "'s average: ");
            studentBook[i].average = sc.nextDouble();

            System.out.println("");
            sc.skip("\n");
        }
        sc.close();

        System.out.print("The names are: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(studentBook[i].name + " ");
        }

        System.out.println();

        System.out.print("The grades are: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(studentBook[i].grade + " ");
        }

        System.out.println();

        System.out.print("The averages are: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(studentBook[i].average + " ");
        }
    }
}
