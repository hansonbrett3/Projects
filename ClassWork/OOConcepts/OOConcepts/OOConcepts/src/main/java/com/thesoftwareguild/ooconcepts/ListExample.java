/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ooconcepts;

// 3. IMPORT ARRAY LIST AND LIST
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class ListExample {

    public static void main(String[] args) {
// 1. CREATE METHOD THAT IS GOING TO BE THE CREATE ADD ELEMENTS
        iteratorExample();
        AddElements();
        EnhancedForLoops();
        removeElements();
    }

    private static void AddElements() {
        List<String> stringList = new ArrayList<String>();
// 4. LIST SIZE BEFORE ADDING ANY STRINGS
        System.out.println("List size before adding any strings: " + stringList.size());
// 5. ADDING FIRST STRING (OR WHATEVER DATA TYPE IS SPECIFIED)                
        stringList.add("My first String:");
        System.out.println("List size after adding one string: " + stringList.size());
// 6.   SAME AS STEP FIVE BUT ADDED SECOND STRING           
        stringList.add("My second String:");
        System.out.println("List size after adding two strings: " + stringList.size());
    }
// 2. 

// 7. New Method    
    public static void removeElements() {
        List<String> stringList = new ArrayList<String>();
// 8.        
        stringList.add("My First String");

        stringList.add("My Second String");

        stringList.add("My Third String");
/// 9.        
        System.out.println("List size after adding 3 strings: " + stringList.size());
/// 10.
        stringList.remove(1);

        System.out.println("List size after removing second element: " + stringList.size());
        // 11.       
        stringList.remove(1);
        // 12.        
        stringList.remove(0);
        System.out.println("List size after removing all elements: " + stringList.size());

    }
    
    private static void EnhancedForLoops() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("My First String");

        stringList.add("My Second String");

        stringList.add("My Third String");

        stringList.add("My Fourth String");

        System.out.println("List Size: " + stringList.size());

        for (String s : stringList) {
            System.out.println(s);
        }

    }


    private static void iteratorExample() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("My First String");

        stringList.add("My Second String");

        stringList.add("My Third String");
        
        System.out.println("List size: " + stringList.size());
        
        Iterator<String> iter = stringList.iterator();
        
        while(iter.next());
        {
            String current = iter.next();
            System.out.println(current);
    }
        System.out.println("==============================iteratorExample===============END==============");

   

private static void EnhancedForLoops() {
        List<String> stringList = new ArrayList<String>();

        stringList.add("My First String");

        stringList.add("My Second String");

        stringList.add("My Third String");

        stringList.add("My Fourth String");

        System.out.println("List Size: " + stringList.size());

        for (String s : stringList) {
            System.out.println(s);
        }

    }
    }

    private static void AddElements() DECLARE THE INTERFACE (Ex. LIST)
        
    }
    
    
    
    }
