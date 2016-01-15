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
public class App {
    public static void main(String[] args) {
        
        Student student = new Student("Some Guy", "someguy@email.edu");
        
        Course course = new Course("Taco Dynamics in Suboptimal Enviornments before 1950's",123,"Dr. Taco");
        
        course.enroll(student);
        
        student = new  Student("Other Girl", "someOther@email.com");
        
        course.enroll(student);
        
        System.out.println("Student named " + student.getName() + "is enrolled in:");
        for (Course c: student.getCourseList());
        {
            System.out.println(c.getCourseName());
        }
        
        student.displayCourses();
    }
}
