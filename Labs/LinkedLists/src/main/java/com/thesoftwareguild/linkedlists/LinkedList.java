/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlists;

/**
 *
 * @author apprentice
 */
public interface LinkedList {

    // adds to end of list
    void push(Object item);

    Object get(int index);

    boolean isEmpty();

    Object pop();

    int size();

}
