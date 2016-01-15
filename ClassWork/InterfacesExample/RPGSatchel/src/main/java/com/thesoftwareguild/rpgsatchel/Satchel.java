/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.rpgsatchel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Satchel {

    private Map<String, Item> itemMap = new HashMap<>();
    private final int weightLimit;
    private int currentWeight = 0;

    public Satchel(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public boolean addToSatchel(Item item) {
        if ((item.getItemWeight() + currentWeight) > weightLimit) {
            return false;
        } else {
            currentWeight += item.getItemWeight();
            itemMap.put(item.getItemName(), item);
            return true;
        }
    }

    public Item removeFromSactchel(String itemName) {
        Item temp = itemMap.remove(itemName);
        if (temp != null) {
            currentWeight -= temp.getItemWeight();
        }
        return temp;
    }

    public String[] listItemsInSatchel() {
        Set<String> keySet = itemMap.keySet();
        String[] keyArray = keySet.toArray(new String[0]);
        return keyArray;
    }
}
