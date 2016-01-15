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
public class Airplane {

    private int wingSpan;
    private int topSpeed;
    private int capacity;
// Pilot system check; Doors open and closed, passengers on board, and ETA

    public int getWingspan() {
        return wingSpan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

//    public void setTopSpeed(int topSpeed) {
//        this.topSpeed = topSpeed;
//    }
    public int getCapacity() {
        return capacity;
    }

    public Airplane(int wingSpan, int topSpeed, int capacity) {
        this.wingSpan = wingSpan;
        this.topSpeed = topSpeed;
        this.capacity = capacity;
    }

}
