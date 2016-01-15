/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.student;

/**
 *
 * @author apprentice
 */

import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private String email;
    private List<Course> courseList;
    
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.courseList = new ArrayList<Course>();
        // An Implementation of List. Use Array List, otherwise just list
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public void enroll(Course course)
    {
        courseList.add(course);
    }
    
    public void withdraw(Course course)
    {
        courseList.remove(course);
    }
    
    public List<Course> getCourseList()
    {
        return courseList;
    }

    void displayCourses() {
        for(Course c: courseList)
        {
            System.out.println("c.getCourseName");
        }
        
      
    }
    }
