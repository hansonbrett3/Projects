/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.datamodeling;

/**
 *
 * @author apprentice
 */
public class Course {

    private String courseName;
    private String department;
    private int courseID;
    private int totalStudents;

    public Course(String courseName, String department, int courseID, int totalStudents) {
        this.courseName = courseName;
        this.department = department;
        this.courseID = courseID;
        this.totalStudents = totalStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}

