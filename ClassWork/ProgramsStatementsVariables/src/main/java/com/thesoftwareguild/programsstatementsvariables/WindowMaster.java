/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.programsstatementsvariables;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WindowMaster {
    public static void main(String[] args) {
        
        double height = 0;
        double width = 0;
        
        Scanner sc = new Scanner(System.in);
      
        String stringHeight = "";
        String stringWidth = "";
        
        double area = 0;
        double perimeter = 0;
        double cost = 0;
        
        System.out.println("Hello, Welcome to Window Master. \n Please enter order.");
       
        System.out.println("Please enter window height:");
        
        stringHeight = sc.nextLine();
        
        System.out.println("Please enter window width:");
        stringWidth = sc.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        area = height*width;
        
        perimeter = (height+width)*2;
        
        cost = area* 3.50 + 2.25*perimeter;
        
        System.out.println("Window height = " + stringHeight);
        
        System.out.println("Window width = " + stringWidth);
        
        System.out.println("Window area = " + area);
        
        System.out.println("Window perimeter = " + perimeter);
        
        System.out.println("Total cost = " + cost);
        
        System.out.printf("Total cost (formatted): $%.2f%n", cost);
        
    }
}
