/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._gettingdatafromafile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class GettingDataFromAFile {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String file;

        System.out.print("Which file to open: ");
        file = sc.next();

        Scanner fileIn = new Scanner(new File(file));

        System.out.println("Reading data from " + file);

        Dog firstDog = new Dog();
        firstDog.breed = fileIn.next();
        firstDog.age = fileIn.nextInt();
        firstDog.weight = fileIn.nextDouble();

        Dog secondDog = new Dog();
        secondDog.breed = fileIn.next();
        secondDog.age = fileIn.nextInt();
        secondDog.weight = fileIn.nextDouble();

        sc.close();

        fileIn.close();

        System.out.println("First Dog: " + firstDog.breed + ", " + firstDog.age + ", " + firstDog.weight);
        System.out.println("Second Dog: " + secondDog.breed + ", " + secondDog.age + ", " + secondDog.weight);
    }
}
