/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.interfacesexample;

/**
 *
 * @author apprentice
 */
public class Ball implements Colorable{
////2. public class Ball implements... add overrids
    
    private String color;
    
    @Override
    public void setColor(String color) {
       this.color = color;
        System.out.println("The ball is " + color + ".");
    }

    @Override
    public String getColor() {
        return color;
    }
    
    public void bounce()
    {
        System.out.println("Off the wall!!!");
    }
    
}
