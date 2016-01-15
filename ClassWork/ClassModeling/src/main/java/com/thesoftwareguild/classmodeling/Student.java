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
public class Student {
    private int GPA;
    private int studentID;
    private int grade;

    public int getGPA() {
        return GPA;
    }
// Using the school system to find another student, but don't want to show GPA
//    public void setGPA(int GPA) {
//       this.GPA = GPA;
//  }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public Student(int GPA, int studentID, int grade)
    {
        this.GPA = GPA;
        this.studentID = studentID;
        this.grade = grade;
    }
            
}
