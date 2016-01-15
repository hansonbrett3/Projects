/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlistexample;

/**
 *
 * @author apprentice
 */
public interface LinkedList extends Iterable {
    
    // adds to end of list
    void append(Object item);
    
    Object get(int index);
    
    //  insert after given index
    void insert(int index, Object item);
    
    boolean isEmpty();
    
    void prepend(Object item);
    
    Object remove (int index);
    
    int size();
}
