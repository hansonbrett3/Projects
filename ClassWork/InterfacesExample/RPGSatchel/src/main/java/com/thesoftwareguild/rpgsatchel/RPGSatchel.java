/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thesoftwareguild.rpgsatchel;

/**
 *
 * @author apprentice
 */

public class RPGSatchel {
    public static void main(String[] args) {
        
        Sword weapon = new Sword ();
        Shield protection = new Shield ("Large Sheild", 30);
        Satchel backpack = new Satchel(50);
        
        backpack.addToSatchel(weapon);
        backpack.addToSatchel(protection);
        
        Item magic = (Item) new Potion ();
        backpack.addToSatchel (magic);
        
        String[] items = backpack.listItemsInSatchel();
        
        for (String itemName: items)
        {
            System.out.println(itemName);
        }
    }
    
}
