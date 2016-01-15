/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.classroster;

import com.thesoftwareguild.classroster.dao.ClassRoster;
import com.thesoftwareguild.classroster.dto.Student;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
class ClassRosterController {

    private final ConsoleIO con = new ConsoleIO();
    private final ClassRoster roster = new ClassRoster();
    
    void run() {
        try{
        boolean keepAlive = true; //whenever this switch goes off....
        int menuSelection = 0;
        roster.loadRoster();
        while (keepAlive) 
        {
            printMenu();  //inform user of the options using a prompt
            menuSelection = con.readInt("Please select from the above choices", 1, 5);
            
            switch(menuSelection)
            {
                case 1: 
                    con.print("Listing Student IDs");
                    // create a hash map with student id being a key
                    listStudents(); // - ListStudents Method
                    break;
                case 2:
                    con.print("Creating New Student...");
                    createStudent();
                  
                    break;
                case 3:
                    con.print("Viewing Student Information");
                    viewStudent();
                    break;
                case 4: 
                    con.print("Removing Student");
                    break;
                case 5:
                    con.print("Exiting...");
                    keepAlive = false;
                    break;
                default:
                    con.print("Unkown Input");
               
            }
        }
        con.print("Thank you for using our product.");
        roster.writeRoster();
    } catch(FileNotFoundException e)
    {
        con.print("Roster file was not found.");
    } catch(IOException e)
    {
        con.print("Unable to write roster file.");
    }
    }
    private void printMenu() {
        con.print("Class Roster Main Menu:");
        con.print("1. List Student IDs"); 
        con.print("2. Create New Student");
        con.print("3. View a Student");
        con.print("4. Remove a Student");
        con.print("5. Exit ");
    }
    
    private void listStudents() {
        // Create a hash map with student id being a key
        // The purpose of the Controller is flow control.
        Integer[] studentIds = roster.getAllStudentIds();
        for(int i=0;i<studentIds.length;i++)
        {
            Student student = roster.getStudent(studentIds[i]);
            
        }
    }

    private void createStudent() {
       Integer studentId = con.readInt("Please enter Student ID");
       String firstName = con.readString("Please enter First Name: ");
       String lastName = con.readString("Please enter Last Name:");
       String cohort = con.readString("Please enter Cohort");
       
       Student student = new Student();
       student.setCohort(cohort);
       student.setFirstName(firstName);
       student.setLastName(lastName);
       student.setStudentId(studentId);
       
       roster.createStudent(student);
}

    private void viewStudent() 
    {
        Integer studentId = con.readInt("Please enter the ID of the student you wish to view.");
        Student student = roster.getStudent(studentId);
        
        if (student != null)
        {
            con.print("ID" + student.getStudentId());
            con.print("First Name:" + student.getFirstName());
            con.print("Last Name: " + student.getLastName());
            con.print("Cohort:" + student.getCohort());
            con.print("");
        } else 
        {
            con.print("No student with ID:" + studentId);
        }
        con.readString("Please hit enter to continue.");
    }
    
    private void removeStudent()
    {
        Integer studentId = con.readInt("Please enter the ID of the student to be removed");
        roster.removesStudent(studentId);
        con.readString("Student successfully removed, Please hit enter to continue.");
    }
}
/////////////////////////