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
public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Random math = new Random();
        
        for (int i = 0; i<10; i++) {
            list.add(math.nextInt(100));
        }
        System.out.println("ArrayList: " + list);
    }
}
