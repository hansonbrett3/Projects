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

public class Course {
    private String courseName;
    private int courseNumber;
    private String instructor;
    private List<Student>registrar;
    
    public Course(String courseName, int courseNumber, String instructor)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.registrar = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Student> getRegistrar() {
        return registrar;
    }

    public void setRegistrar(List<Student> registrar) {
        this.registrar = registrar;
    }
    
    public void enroll(Student student)
    {
        student.enroll(this);
        registrar.add(student);
    }
    public void withdraw(Student student)
    {
        registrar.remove(student);
        student.withdraw(this);
    }
}
