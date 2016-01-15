/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.classmodeling;

/**
 *
 * @author apprentice
 */
public class Car {
    private int milesPerGallon;
    private int topSpeed;
    private int length;
    
    /// An Engineer would be using this when running tests

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public Car (int milesPerGallon, int topSpeed, int length)
    {
        this.milesPerGallon = milesPerGallon;
        this.topSpeed = topSpeed;
        this.length = length;
    }
    
}
