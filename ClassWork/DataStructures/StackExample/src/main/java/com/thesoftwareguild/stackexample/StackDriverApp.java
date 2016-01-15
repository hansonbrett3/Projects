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
        String f  = "f";
        
        System.out.println("pushing" + a);
        stack.push(a);
        System.out.println("pushing" + b);
        stack.push(b);
        System.out.println("pushing" + c);
        stack.push(c);
        System.out.println("pushing" + d);
        stack.push(d);
        System.out.println("pushing" + f);
        stack.push(f);
        
        Iterator itr = stack.iterator();
        System.out.println("Printing values in stack using iterator....");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Prinitng stack values using enhanced for loop...");
        for (Object o: stack)
        {
            System.out.println(o);
        }
        

        
        
        System.out.println("Popping...");
        System.out.println((String)stack.pop() );
        System.out.println("Popping...");
        System.out.println((String)stack.pop() );
        System.out.println("Popping...");
        System.out.println((String)stack.pop() );
        System.out.println("Popping...");
        System.out.println((String)stack.pop() );
        System.out.println("Popping...");
        System.out.println((String)stack.pop() );

        
    }

}
