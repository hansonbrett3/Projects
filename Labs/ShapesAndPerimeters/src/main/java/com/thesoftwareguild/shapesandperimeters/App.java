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
public class App {
    public static void main(String[] args) {
        
        
        
        System.out.println("SQUARE");
        Shape squareOne = new Square();
        
        squareOne.calculateArea();
        squareOne.calculatePerimeter();
        squareOne.color = "blue";
        System.out.println("Color: " + squareOne.color);
        System.out.println("");
        
        Shape triangleOne = new Triangle();
        System.out.println("TRIANGLE");
        triangleOne.calculateArea();
        triangleOne.calculatePerimeter();
        triangleOne.color = "red";
        System.out.println("Color: " + triangleOne.color);
        System.out.println("");
        
        Shape rectangleOne = new Rectangle();
        System.out.println("RECTANGLE");
        rectangleOne.calculateArea();
        rectangleOne.calculatePerimeter();
        rectangleOne.color = "purple";
        System.out.println("Color: " + rectangleOne.color);
        System.out.println("");
        
        Shape circleOne = new Circle();
        System.out.println("CIRCLE");
        circleOne.calculateArea();
        circleOne.calculatePerimeter();
        circleOne.color = "Orange";
        System.out.println("Color: " + circleOne.color);
        System.out.println("");
        
    }
}
