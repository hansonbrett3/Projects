/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecalculatorwithconsoleio;

/**
 *
 * @author apprentice
 */
/**
 *
 * @author apprentice
 */
public class SimpleCalculator {
    private double operand1;
    private double operand2;
    

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
   
    public void add() {
         System.out.println(operand1 + operand2);
    }
    
    public void subtract() {
        System.out.println(operand1 - operand2);
    }
    
    public void multiply() {
        System.out.println(operand1 * operand2);
    }
    
    public void divide() {
        System.out.println(operand1 / operand2);
    }
}

