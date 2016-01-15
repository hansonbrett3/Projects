/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.stackexample;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class StackDriverApp {
    
    public static void main(String[] args) {
        
        StackInterface stack = new ArrayStack();
        
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String f = "f";
        
        System.out.println("Pushing " + a);
        stack.push(a);
        System.out.println("Pushing " + b);
        stack.push(b);
        System.out.println("Pushing " + c);
        stack.push(c);
        System.out.println("Pushing " + d);
        stack.push(d);
        System.out.println("Pushing " + f);
        stack.push(f);
        
        Iterator itr = stack.iterator();
        System.out.println("Printing values in the stack using iterator...");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        //enhanced for loop requires that your collection supports an iterator
        //it looks for an iterable, if it finds one, then it knows an iterator is available
        System.out.println("Printing stack values using enhanced for loop...");
        for(Object o : stack){
            System.out.println(o);
        }
        
        
        System.out.println("Popping...");
        System.out.println(stack.pop());
        System.out.println("Popping...");
        System.out.println(stack.pop());
        System.out.println("Popping...");
        System.out.println(stack.pop());
        System.out.println("Popping...");
        System.out.println(stack.pop());
        System.out.println("Popping...");
        System.out.println(stack.pop());
        
        
        
        
        
    }
    
}
