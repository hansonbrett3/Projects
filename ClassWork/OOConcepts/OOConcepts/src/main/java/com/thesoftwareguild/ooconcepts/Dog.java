/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ooconcepts;

/**
 *
 * @author apprentice
 */
public class Dog {

    // Class-level variables (lower camel case)

    private String dogName; // 
    private int age;
    private double weight;
    private String idTag;


    public Dog(String dogName, int age, double weight) {
        dogCount++;
        this.dogName = dogName;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String dogName) {
        dogCount++;
        this.dogName = dogName;
        this.age = Integer.MAX_VALUE;
        this.weight = Double.MAX_VALUE;
    }

    public String getDogName() {
        return dogName;
    }
//this turns DogName into a read only property
//    public void setDogName(String dogName) {
//        this.dogName = dogName; // Making a distinction for the classes
//       // talking about an object that encapsulates
//  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void bark() {
        System.out.println("WOOF");
    }

    public void sit() {
        System.out.println("Sitting...");
    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }
    
    private static int dogCount = 0;
    
    public static int dogTracker()
    {
        return dogCount;
    }
    
// public Dog()
//{
    
//}
}


