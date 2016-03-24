/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._storingdatainafile;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class StoringDataInAFile {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Car[] vehicle;

        vehicle = new Car[5];

        System.out.print("To which file do you want to save this information? ");
        String fileName = sc.next();
        PrintWriter writer = new PrintWriter(new FileWriter("cars.txt"));
        for (int i = 0; i < 5; i++) {

            System.out.println("Car " + (i + 1));
            vehicle[i] = new Car();

            System.out.print("\t Make: ");
            vehicle[i].make = sc.next();
            writer.write(vehicle[i].make);

            System.out.print("\t Model: ");
            vehicle[i].model = sc.next();
            writer.write(vehicle[i].model);

            System.out.print("\t Year: ");
            vehicle[i].year = sc.nextInt();
            writer.write(vehicle[i].year);

            System.out.print("\t License: ");
            vehicle[i].license = sc.next();
            writer.write(vehicle[i].license);

        }
        writer.close();
        
        System.out.println("Data Saved");
    }

}
