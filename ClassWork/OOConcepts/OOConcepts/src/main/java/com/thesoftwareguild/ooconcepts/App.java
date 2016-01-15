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

//if you dont deine a default contructor, the hidden default contructor will creat an instance of the class

public class App {
    public static void main(String[] args) {
        
        Dog rex = new Dog("T-Rex",10, 22.00);
        
        rex.bark();
        rex.sit();
        
        System.out.println("Dog named: " + rex.getDogName() + " weighs " + 
                rex.getWeight() + " before training");
        
        train(rex); 
        
        System.out.println("Dog named: " + rex.getDogName() + " weighs " + 
                rex.getWeight() + " after training");
        
        Dog sparky = new Dog ("Sparky",8,15.0);
        Dog other = new Dog("Mut", 6, 30.5);
        
        System.out.println("We have a total of " + Dog.dogTracker() + " dogs.");
    }
    
    public static void train(Dog animal)
    {
        double weight = animal.getWeight();
        weight -= 2.5;
        animal.setWeight(weight);
        
    }
    
}
