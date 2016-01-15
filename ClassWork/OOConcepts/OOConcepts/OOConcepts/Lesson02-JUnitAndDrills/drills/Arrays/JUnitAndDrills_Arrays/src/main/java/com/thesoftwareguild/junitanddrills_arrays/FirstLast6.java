/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 
//
//FirstLast6({1, 2, 6}) -> true
//FirstLast6({6, 1, 2, 3}) -> true
//FirstLast6({13, 6, 1, 2, 3}) -> false
//
//public booleaneanean FirstLast6(int[] numbers) {
//
//}
package com.thesoftwareguild.junitanddrills_arrays;

/**
 *
 * @author apprentice
 */
public class FirstLast6 {

    public boolean firstLast6(int[] arrayNumbers) {

        for (int i = 0; i < arrayNumbers.length; i++) {
            int a = arrayNumbers[i];

            if (arrayNumbers[0] == 6 || arrayNumbers[a] == 6) {
                return true;
            } else {
                return false;
            }
        }
    }
    
