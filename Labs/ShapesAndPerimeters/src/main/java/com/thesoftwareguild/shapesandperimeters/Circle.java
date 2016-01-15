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
public class Circle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println("Enter Circle Radius: ");
        double circleRadius = sc.nextInt();
        
        double area = Math.PI*(circleRadius*circleRadius);
        System.out.println("-------------------------------------------------");
        System.out.println("Circle Area: " + area);
        System.out.println("-------------------------------------------------");
        
        
    }

    @Override
    public void calculatePerimeter() {
       System.out.print("Enter Circle Radius: ");
       double circleRadius = sc.nextInt();
      
        double perimeter = 2*(Math.PI*circleRadius);
        System.out.println("-------------------------------------------------");
        System.out.println("Circle Perimeter: " + perimeter);
        System.out.println("-------------------------------------------------");
    }

}
