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
public abstract class Shape {
    
    Scanner sc = new Scanner(System.in);
    
    String color = "";
    
    public abstract void calculateArea() ;
    public abstract  void calculatePerimeter();
}


//They are designed to be overridden by inherited shapes
//    make sure that any shape that you inherit from the base class implements their own versions of
//    area() and perimeter() based on the type of shape it is.
//            It is suggested you start with a square because this should be the easiest to implement. Create a Shape base class, inherit a square
//from it, and override 