/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlistexample.generics;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedListNodeImpl<>();
        
        System.out.println("Working with generic linked list...");
        
        System.out.println("Linked list size: " + ll.size());
        
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        
        ll.prepend(one);
        
        System.out.println("LL size: " + ll.size());
        System.out.println("LL[0]" + ll.get(0));
        
        ll.remove(0);
        
        System.out.println("One element removed LL size: " + ll.size());
        
        ll.prepend(one);
        ll.prepend(two);
        ll.append(three);
        System.out.println("prepend two append one. LL size: " + ll.size());
        System.out.println("+++++++++++++++++");
        for (Object o:ll)
        {
            System.out.println(o);
        }
        
        ll.remove(1);
        System.out.println("removed object at index 1");
        System.out.println("++++++++++++++++");
        for (Object o:ll)
        {
            System.out.println(o);
        }
        
        ll.append(four);
        ll.append(five);
        System.out.println("appended four and five");
        System.out.println("+++++++++++++");
        for (Object o : ll)
        {
            System.out.println(o);
        }
        ll.remove(3);
        System.out.println("removed object at index 3");
        System.out.println("++++++++++++++++");
        for (Object o:ll)
        {
            System.out.println(o);
        }
        ll.remove(2);
        System.out.println("removed object at index 2");
        System.out.println("+++++++++++++++");
        for (Object o: ll)
        {
            System.out.println(o);
        }
        
        ll.insert (0, five);
        System.out.println("Inserterd object after index 0");
        System.out.println("+++++++++++++++++");
        for (Object o: ll)
        {
            System.out.println(o);
        } 
        ll.insert(2, four);
        System.out.println("Inserterd object after index 2");
        System.out.println("+++++++++++++++++");
        for (Object o: ll)
        {
            System.out.println(o);
        } 
        System.out.println("Print ALL things with the iterator");
        System.out.println("+++++++++++++++++++");
        Iterator iter = ll.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}

