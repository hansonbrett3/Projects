/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.shapesandperimeters;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Triangle extends Shape {

    @Override
    public void calculateArea() {

        System.out.print("Enter Triangle Base: ");
        double base = sc.nextInt();        
        System.out.print("Enter Triangle Height: ");
        double height = sc.nextInt();

        double area = ((base*height)/2);
        System.out.println("-------------------------------------------------");
        System.out.println("Triangle Area: " + area);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void calculatePerimeter() {
        
        System.out.println("Please enter the length of each side: ");
        System.out.print("Enter Triangle Side 1: ");
        double sideOne = sc.nextInt();
        System.out.print("Enter Triangle Side 2: ");
        double sideTwo = sc.nextInt();
        System.out.print("Enter Triangle Side 3: ");
        double sideThree = sc.nextInt();
        
        double perimeter = sideOne+sideTwo+sideThree;
        System.out.println("-------------------------------------------------");
        System.out.println("Triangle Perimeter: " + perimeter);
        System.out.println("-------------------------------------------------");
    }

}
