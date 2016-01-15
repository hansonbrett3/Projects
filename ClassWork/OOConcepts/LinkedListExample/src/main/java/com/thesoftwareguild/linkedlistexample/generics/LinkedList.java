/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlistexample.generics;

/**
 *
 * @author apprentice
 */
public interface LinkedList<Item>extends Iterable <Item>{
    
    // adds to end of list
    void append(Item item); // Append is going to take a type (Item) that it is going to take
    
    Item get(int index);
    
    //  insert after given index
    void insert(int index, Item item);
    
    boolean isEmpty();
    
    void prepend(Item item);
    
    Object remove (int index);
    
    int size();
}
