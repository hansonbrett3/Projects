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
public class BasicArrayLists0 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();       
        
        int i = 0;
        
        list.add(0, -113);
        list.add(1, -113);
        list.add(2, -113);
        list.add(3, -113);
        list.add(4, -113);
        list.add(5, -113);
        list.add(6, -113);
        list.add(7, -113);
        list.add(8, -113);
        list.add(9, -113);
        list.add(10,-113);
        
        
        System.out.println("Slot 0 contains a " + list.get(i));
        System.out.println("Slot 1 contains a " + list.get(i));
        System.out.println("Slot 2 contains a " + list.get(i));
        System.out.println("Slot 3 contains a " + list.get(i));
        System.out.println("Slot 4 contains a " + list.get(i));
        System.out.println("Slot 5 contains a " + list.get(i));
        System.out.println("Slot 6 contains a " + list.get(i));
        System.out.println("Slot 7 contains a " + list.get(i));
        System.out.println("Slot 8 contains a " + list.get(i));
        System.out.println("Slot 9 contains a " + list.get(i));
        System.out.println("Slot 10 contains a " + list.get(i));
        
        
    }
}


//Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList. Then display the contents of the ArrayList on the screen.
//
//Do not use a loop. Also, do not use any variable for the index; you must use literal numbers to refer to each slot.