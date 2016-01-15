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
public class BasicArrayLists3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Random math = new Random();
        
        for (int i = 0; i<1000; i++) {
            list.add(math.nextInt(100)+10);
        }
        
     for (int i = 0; i<1000; i++)   
        System.out.print("ArrayList: " + list);
    }
}
