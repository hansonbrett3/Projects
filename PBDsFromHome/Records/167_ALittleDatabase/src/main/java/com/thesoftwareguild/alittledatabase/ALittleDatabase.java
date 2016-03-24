/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.alittledatabase;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class ALittleDatabase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] studentBook;
        studentBook = new Student[3];

        studentBook[0] = new Student();
        System.out.print("Enter student 1's name: ");
        studentBook[0].name = sc.next();
        System.out.print("Enter student 1's grade: ");
        studentBook[0].grade = sc.nextInt();
        System.out.print("Enter student 1's average: ");
        studentBook[0].average = sc.nextDouble();
        sc.skip("\n");
        System.out.println();

        studentBook[1] = new Student();
        System.out.print("Enter student 2's name: ");
        studentBook[1].name = sc.next();
        System.out.print("Enter student 2's grade: ");
        studentBook[1].grade = sc.nextInt();
        System.out.print("Enter student 2's average: ");
        studentBook[1].average = sc.nextDouble();
        sc.skip("\n");
        System.out.println();

        studentBook[2] = new Student();
        System.out.print("Enter student 3's name: ");
        studentBook[2].name = sc.next();
        System.out.print("Enter student 3's grade: ");
        studentBook[2].grade = sc.nextInt();
        System.out.print("Enter student 3's average: ");
        studentBook[2].average = sc.nextDouble();
        sc.skip("\n");
        System.out.println();

        sc.close();

        System.out.println("The students names are: " + studentBook[0].name + " " + studentBook[1].name + " " + studentBook[2].name);
        System.out.println("The students grades are: " + studentBook[0].grade + " " + studentBook[1].grade + " " + studentBook[2].grade);
        System.out.println("The students averages are: " + studentBook[0].average + " " + studentBook[1].average + " " + studentBook[2].average);

    }
}
//
//        for (int i = 0; i < 3; i++) {
//            studentBook[i] = new Student();
//            System.out.print("Enter student " + studentBook[i] + "'s name: ");
//            studentBook[i].name = sc.next();
//            System.out.print("Enter student " + studentBook[i] + "'s grade: ");
//            studentBook[i].grade = sc.nextInt();
//            System.out.print("Enter student " + studentBook[i] + "'s average: ");
//            studentBook[i].average = sc.nextDouble();
//            sc.skip("\n");
//            System.out.println();
//        }
