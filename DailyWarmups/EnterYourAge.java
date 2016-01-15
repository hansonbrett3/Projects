/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dailywarmpups;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class EnterYourAge {
    public static void main(String[] args )
    {
        int yourAge = 0;
        
        System.out.println("How old are you?");
        Scanner sc = new Scanner(System.in);
        
        yourAge = sc.nextInt();
        
        if (yourAge <= 18)
        {
            
            System.out.println("You must be in school");
            
        } else if (yourAge > 18 && yourAge < 65) 
        {
            System.out.println("Time to go to work!");
        } else 
        {
            System.out.println("Enjoy retirement");
        }      
        
    }
}

