package com.thesoftwareguild.interestcalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apprentice
 */
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        double interestRate = .025;
        double principal;
        int currentYear = 2015;
        double beginningPrincipal = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("How much money would you like to invest?");
        principal = sc.nextInt();
        System.out.println("---------------------------------------------");

        beginningPrincipal += principal;

        for (int i = 1; i <= 20; i++) {
            currentYear++;
            count++;
            double interestEarned = beginningPrincipal * interestRate;
            double endingPrincipal = beginningPrincipal + interestEarned;

            System.out.println("Year:" + currentYear + "(Year " + count + ")");
            System.out.println("Beginning Principal: $" + beginningPrincipal);
            System.out.println("Interest Earned: $" + interestEarned);
            System.out.println("End of Year Principal $" + endingPrincipal);
            System.out.println("---------------------------------------------");

            beginningPrincipal += interestEarned;
        }

    }

}
