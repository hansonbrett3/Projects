/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.shapesandperimeters;

/**
 *
 * @author apprentice
 */
public class Rectangle extends Shape {


    @Override
    public void calculateArea() {
        System.out.print("Enter Rectangle Height: ");
        double rectangleHeight = sc.nextInt();
        System.out.print("Enter Rectangle Length: ");
        double rectangleLength = sc.nextInt();

        double area = rectangleHeight * rectangleLength;
        System.out.println("-------------------------------------------------");
        System.out.println("Rectangle Area: " + area);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void calculatePerimeter() {
       System.out.print("Enter Rectangle Length: ");
       double rectangleLength = sc.nextInt();
       System.out.print("Enter Rectangle Height: ");
       double rectangleHeight = sc.nextInt();
        
        double perimeter = (2 * rectangleLength) + (2*rectangleHeight);
        System.out.println("-------------------------------------------------");
        System.out.println("Rectangle Perimeter: " + perimeter);
        System.out.println("-------------------------------------------------");
    }
       
     
}
