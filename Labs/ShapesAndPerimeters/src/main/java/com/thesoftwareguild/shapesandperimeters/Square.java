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
public class Square extends Shape {

    @Override
    public void calculateArea() {
        System.out.print("Enter Length: ");
        double length = sc.nextInt();

        double area = (2 * length);
        System.out.println("-------------------------------------------------");
        System.out.println("Square Area: " + area);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void calculatePerimeter() {
        System.out.print("Enter Length: ");
        double length = sc.nextInt();
        
        double perimeter = 4 * length;
        System.out.println("-------------------------------------------------");
        System.out.println("Square Perimeter: " + perimeter);
        System.out.println("-------------------------------------------------");
    }

}

//Create a set of classes to represent a square, rectangle, triangle, and circle
//
//Have these classes inherit from a base class called shape
//
//Each will implement at least two methods:
//           the area of the shape, return area of shape
//           the perimeter of the shape, return area of perimeter
//The base class Shape will have a property called color and the two methods area() and perimeter(),
//        but they will be empty
//They are designed to be overridden by inherited shapes
//    make sure that any shape that you inherit from the base class implements their own versions of
//    area() and perimeter() based on the type of shape it is.
//            It is suggested you start with a square because this should be the easiest to implement. Create a Shape base class, inherit a square
//from it, and override 
