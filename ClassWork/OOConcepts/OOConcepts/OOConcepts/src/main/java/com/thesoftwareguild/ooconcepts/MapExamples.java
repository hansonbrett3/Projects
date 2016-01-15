/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ooconcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class MapExamples {

    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<String, Student>();

// declaring a generic type of interface
// collection - 1 type going in
// map 2 types going in (key, value)
        
        valuesCollectionExample();
        listAllValues();
        listAllKeys();
        retrieveKeyValue();
        addingKeyValue();
        replaceKeyValue();
    }

    private static void addingKeyValue() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 313000000);
        populations.put("Canada", 340000000);
        populations.put("United Kingsdom", 63000000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " + populations.size());

    }

    private static void replaceKeyValue() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 2000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingdom", 630000000);
        populations.put("Japan", 127000000);

        populations.put("USA", 313000000);

        System.out.println("Map size is: " + populations.size());

    }

    private static void retrieveKeyValue() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 313000000);
        populations.put("Canada", 340000000);
        populations.put("United Kingsdom", 63000000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " + populations.size());

        Integer japanPopulation = populations.get("Japan");

        System.out.println("Population of Japan is: " + populations.size());

    }

    private static void listAllKeys() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 2000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingdom", 630000000);
        populations.put("Japan", 127000000);

        populations.put("USA", 313000000);

        System.out.println("Map size is: " + populations.size());
        
        // Keys are stored in a collection called set
        // In set there are no duplicates
        // Can't count on order
        Set<String> keys = populations.keySet();
        
        for(String k: keys)
        {
            System.out.println(k);
        }
        
    }

    private static void listAllValues() {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 313000000);
        populations.put("Canada", 340000000);
        populations.put("United Kingsdom", 63000000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " + populations.size());

        Integer japanPopulation = populations.get("Japan");

        System.out.println("Population of Japan is: " + populations.size());
        
        Set<String> keys = populations.keySet();
        
        for (String k: keys)
        {
            System.out.println("The population of " + k + " is" + populations.get(k));
        }

    }

    private static void valuesCollectionExample() {
         Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 313000000);
        populations.put("Canada", 340000000);
        populations.put("United Kingsdom", 63000000);
        populations.put("Japan", 127000000);

        System.out.println("Map size is: " + populations.size());
        
        Collection<Integer> popValues = populations.values();
     
// ENHANCED FOR LOOP   
        for (int p: popValues)
        {
            System.out.println(p);
        }
    }
       
}
// Collections will carry reference to Objects