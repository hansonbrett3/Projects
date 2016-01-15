/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylistspbd;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Brett
 */
public class CopyingArraYlists {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        Random math = new Random();

        for (int i = 0; i < 10; i++) {
            arrayList1.add(math.nextInt(100) + 1);
            arrayList1.get(i);
        }

        System.out.println();
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList1);

        for (int a = 0; a < 10; a++) {
            arrayList2.get(a);
        }

        arrayList1.remove(9);
        arrayList1.add(9, -7);

        System.out.println("ArrayList1: " + arrayList1);
        System.out.println("ArrayList2: " + arrayList2);
    }
}
