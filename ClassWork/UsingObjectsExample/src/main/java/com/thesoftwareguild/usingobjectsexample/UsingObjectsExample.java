/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.usingobjectsexample;

/**
 *
 * @author apprentice
 */
public class UsingObjectsExample {
    public int add(int a, int b)
    {
        return a+b;
    }
    
    public double add(double a, double b)
    {
        return a+b;
    }
    
    public void printValues(int a, double b)
    {
        System.out.println("A:" + a + " B:" + b);
    }
    
    public void printValues( int a, double b, boolean c)
    {
        System.out.println("A:" + a + " B:" + b + " C: " + c);
    }
}
