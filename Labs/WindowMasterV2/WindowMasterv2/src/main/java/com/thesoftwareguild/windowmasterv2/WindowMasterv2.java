/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.windowmasterv2;

/**
 *
 * @author apprentice
 */

import java.util.Scanner;

public class WindowMasterv2 {
    public static void main(String[] args) {
        
        double height = 0;
        double width = 0;
        double costTrim = 0;
        double costGlass = 0;
        
        Scanner sc = new Scanner(System.in);
        
        String stringHeight = "";
        String stringWidth = "";
        String stringCostGlass = "";
        String stringCostTrim = "";
        
        double area = 0;
        double perimeter = 0;
        double cost = 0;
        
        
        System.out.println("Hello, Welcome to Window Master.\nPlease enter your order.");
        
        System.out.println("Please enter window height:");
        stringHeight = sc.nextLine();
        
        System.out.println("Please enter window width:");
        stringWidth = sc.nextLine();
        
        System.out.println("What is the cost of glass?");
        stringCostGlass = sc.nextLine();
        
        System.out.println("What is the cost of trim?");
        stringCostTrim = sc.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);  
        costTrim = Float.parseFloat(stringCostTrim);
        costGlass = Float.parseFloat(stringCostGlass);
        
        area = (height+width)*2;
        
        perimeter = (height+width)*2;
        
        cost = area*costGlass + costTrim*perimeter;
        
        System.out.println("Window height = " + stringHeight);
        
        System.out.println("Window width = " + stringWidth);
        
        System.out.println("Cost of Glass = " + stringCostGlass);
        
        System.out.println("Cost of Trim = " + stringCostTrim);
        
        System.out.println("Window area = " + area);
        
        System.out.println("Window perimeter = " + perimeter);
        
        System.out.println("Total cost = " + cost);
        
        System.out.printf("Total cost (formatted): $%.2f%n", cost);
        
        
    }
    
}
