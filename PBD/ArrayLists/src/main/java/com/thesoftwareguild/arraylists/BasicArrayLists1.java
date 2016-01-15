/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylistspbd;

import java.util.ArrayList;

/**
 *
 * @author Brett
 */
public class BasicArrayLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(-113);
        } 
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Slot " + i + " contains a " + list.get(i));
        }
    }
}
