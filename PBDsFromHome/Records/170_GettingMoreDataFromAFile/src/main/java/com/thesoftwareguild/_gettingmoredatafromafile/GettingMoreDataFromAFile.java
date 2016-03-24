/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._gettingmoredatafromafile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author bretthanson
 */
public class GettingMoreDataFromAFile {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String file;

        System.out.println("While file to open? ");
        file = sc.next();

        sc.close();

        Scanner fileIn = new Scanner(new File(file));

        System.out.println("Reading data from " + file);

        NameAge[] contact;
        contact = new NameAge[5];

        for (int i = 0; i < 5; i++) {
            contact[i] = new NameAge();
            contact[i].name = fileIn.next();
            contact[i].age = fileIn.nextInt();
//            fileIn.skip("\n");
        }

        fileIn.close();

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + contact[i].name + ", " + contact[i].age);
        }

    }
}
