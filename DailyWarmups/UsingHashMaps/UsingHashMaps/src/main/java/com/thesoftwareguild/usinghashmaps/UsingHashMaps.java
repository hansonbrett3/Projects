/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.usinghashmaps;

import static java.lang.reflect.Array.set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class UsingHashMaps {

    private static Object teamScores;

    public static void main(String[] args) {
        HashMap<String, Integer> playerScores = new HashMap<>();
        
        
        int teamScore = 0;
        playerScores.put("Smith", 23);
        playerScores.put("Jones", 12);
        playerScores.put("Jordan", 45);
        playerScores.put("Pippen", 32);
        playerScores.put("Kerr", 15);

        Set<String> keys = playerScores.keySet();

        Collection<Integer> pointValues = playerScores.values();

        for (String k : keys) {
            System.out.println(k);

        }
        for (Integer p : pointValues) {
            System.out.println(p);
        }
        
        System.out.println(playerScores);
        
        for (String name: playerScores.keySet())
        {
            System.out.println("Player:" + name + " score:" + playerScores.get(name));
            teamScore += playerScores.get(name);
        }
        
        System.out.println("Team Average:" + (double)teamScore/playerScores.size());

    }
}
