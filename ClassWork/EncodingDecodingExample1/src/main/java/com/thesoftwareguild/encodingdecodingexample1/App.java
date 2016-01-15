/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.encodingdecodingexample1;

/**
 *
 * @author apprentice
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        Student student = new Student();
        student.setFirstName("Sample");
        student.setLastName("John");
        student.setCohort("Java - June 2015");
        student.setStudentId(1);

        students.put(student.getStudentId(), student);

        Student student = new Student();
        student.setFirstName("Dave");
        student.setLastName("Doe");
        student.setCohort("Java - Sept 2015");
        student.setStudentId(2);

        students.put(student.getStudentId(), student);

        Student student = new Student();
        student.setFirstName("Jane");
        student.setLastName("Smith");
        student.setCohort("Java - June 2015");
        student.setStudentId(1);

        students.put(student.getStudentId(), student);

        encode("Students.txt", students);
    }

    private static void encode(String filename, Map<Integer, Student> students) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            Set <Integer> keys = students.keySet();
            for (Integer k : keys) {
                Student student = students.get(k);
                writer.printf("%d::%s::%s::%s",
                        student.getStudentID(),
                        student.getFirstName(),
                        student.getLastName(),
                        student.getCohort()
                         );
            writer.println("");
        }
        writer.flush();
        writer.close();
    catch (Exception e) {
            System.out.println(e.getMessage());
            }

        }

