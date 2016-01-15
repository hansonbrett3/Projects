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

public class App {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.doWork();
        employee.createObjectives();

        Manager manager = new Manager();
        manager.doWork();
        manager.createObjectives();
        //Manager specific methods
        manager.hire();
        manager.givePerformanceReview();
        manager.fire();

        SummerIntern intern = new SummerIntern();
        intern.doWork();
        employee.createObjectives();
        intern.createObjectives();
        // special intern method
        intern.requestPerformanceReview();
        
        CEO ceo = new CEO ();
        ceo.getYearlyBonus();
    }
}

/// 
