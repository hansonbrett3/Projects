/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.encodingdecodingexample;

/**
 *
 * @author apprentice
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private Integer studentId;
    private String cohort;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentID) {
        this.studentId = studentID;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
    
}


//1. Declare Variables
//2. right-click, insert code, getters and setters, select all, encapsulate fields