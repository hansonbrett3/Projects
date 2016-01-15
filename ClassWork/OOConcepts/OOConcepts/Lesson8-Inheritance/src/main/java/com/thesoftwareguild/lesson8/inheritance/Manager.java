/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.     
 */
package com.thesoftwareguild.lesson8.inheritance;

/**
 *
 * @author apprentice
 */
public class Manager extends Employee /*IS A*/ {
    
    protected String title;
    public Manager()
    {
        super();
        title = "Manager";
    }

    public void hire() {
        System.out.println("Welcome aboard!");
    }

    public void fire() {
        System.out.println("Your services are no longer required!");
    }

    public void givePerformanceReview() {
        System.out.println("You did well, try to do better!");
    }

    /// Adding Override notation
    @Override
    public void createObjectives() {
        System.out.println(getName());
        System.out.println("Manager said: I want my employees to work harder!");
        super.createObjectives();
    }

}
