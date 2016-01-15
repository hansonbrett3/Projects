/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.programsstatementsvariables;

/**
 *
 * @author apprentice
 */
public class OperandsExample {

    public static void main(String[] args) {
        int sum = 0;

        int operand1 = 3;
        int operand2 = 2;

        sum = 2 + 3;
        sum = operand1 + operand2;

        System.out.println("Sum is:" + sum);

        int iAmWithPrefix = 20;

        System.out.println("Prefix print:" + (--iAmWithPrefix));

        int iAmWithPostfix = 30;
        System.out.println("Postfix print:" + (iAmWithPostfix++));

        System.out.println("Postfix print:" + iAmWithPostfix);

        int result = operand1 + 42;

        int operand3 = operand2;

        result = operand1 + operand2 + operand3;
        
        result = 2;
        
        result += 4;
        
        result += operand1;
        
        result += operand1 + operand2;
        
        result = 9 - 5;
        
        result = operand1 - operand2;
        
        result = 15 - operand1;
        
        result = 19 -operand1 - operand2 - operand3;
        
        result = 2;
        
        result -= 4;
        
        result -= operand1;
        
        result = 2 * 3;
        
        result = operand1 * operand2;
        
        result = 2 * operand1;
        
        result = 2 * operand1 * operand2 * operand3;
        
        result = 2;
        
        result *= 4;
        
        result *= operand1;
        
        operand1 = 5;
        operand2 = 7;
        
        result = 6/3;
        
        result = operand1 / operand2;
        
        result = operand1 % operand2;
        
        result = 20 / operand1;
        
        result = 245 / operand1/operand2/operand3;
        
        result = 40;
        
        result /= 4;
        
        result /= operand1;
        
    }
    
}
