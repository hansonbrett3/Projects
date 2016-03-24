/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.basicrecords;

import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class BasicRecords {

    public static void main(String[] args) {
        Scanner fin = new Scanner(System.in);

        Student first = new Student();
        System.out.print("Enter the first student's name: ");
        first.name = fin.nextLine();
        System.out.print("Enter the first student's grade: ");
        first.grade = fin.nextInt();
        System.out.print("Enter the first student's average: ");
        first.average = fin.nextDouble();
        fin.skip("\n");
        System.out.println();

        Student second = new Student();
        System.out.print("Enter the second student's name: ");
        second.name = fin.nextLine();
        System.out.print("Enter the second student's grade: ");
        second.grade = fin.nextInt();
        System.out.print("Enter the second student's average: ");
        second.average = fin.nextDouble();
        fin.skip("\n");
        System.out.println();

        Student third = new Student();
        System.out.print("Enter the third student's name: ");
        third.name = fin.nextLine();
        System.out.print("Enter the third student's grade: ");
        third.grade = fin.nextInt();
        System.out.print("Enter the third student's average: ");
        third.average = fin.nextDouble();
        fin.skip("\n");
        System.out.println();

        System.out.println("The names are: " + first.name + " " + second.name + " " + third.name);
        System.out.println("The grades are: " + first.grade + " " + second.grade + " " + third.grade);
        System.out.println("The averages are: " + first.average + " " + second.average + " " + third.average);
        fin.skip("\n");
        System.out.println();
        
        double studentAverage = ((first.average + second.average + third.average) / 3);

        System.out.println("The average for the three students is: " + studentAverage);

        fin.close();
    }

}
