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
public class Employee {

    private String name;
    private String ssn;
    
    public Employee()
    {
        name = "Unknown";
        ssn= "999-99-9999";
    }

    public void doWork() {
        System.out.println("I am working really hard. When is lunch?");
    }

    public void setObjectives() {

    }

    public void createObjectives() {
        System.out.println("Eat more sandwiches!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
   
}
