/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ArrayExamples;

/**
 *
 * @author apprentice
*/

import java.util.Scanner;

public class MinMAxAvgWithArrays {
    public static void main(String[] args) {
        System.out.println("Enter values to get min max and average:");
        
        Scanner sc = new Scanner(System.in);
        
        int[] userInputs = new int[10];
        
        for(int i=0; i<userInputs.length; i++)
        {
            System.out.println("Please enter number ("+i+"):");
            userInputs[i] = sc.nextInt();
        }
        
        int min = userInputs[0];
        int max = userInputs[0];
        int sum = 0;
        for(int input:userInputs){
            min = (input<min)?input:min;
            max = (input>max)?input:max; 
            sum += input;
        }
        
        System.out.println("Average:" + (double)sum/userInputs.length + "\nMin:" + min + "Max: " + max);
    }
    
}
