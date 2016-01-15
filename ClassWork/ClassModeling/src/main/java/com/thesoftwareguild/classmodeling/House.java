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
public class House {
    private int capacity;
    private int sqFeet;
    private int zip;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public House (int capacity, int sqFeet, int zip){
        this.capacity = capacity;
        this.sqFeet = sqFeet;
        this.zip = zip;
                
    }

}

