/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlists;

import java.util.NoSuchElementException;


/**
 *
 * @author apprentice
 */
public class LinkedListStack implements LinkedList {

    private Node first;
    private Node last;
    private int numItems;


    private class Node {

        Object item;
        Node next;
    }

    // === PUSH/APPEND ===
    @Override
    public void push(Object item) {
        Node prevLast = last; //create a new node reference called prevLast, and assign it the value of the last node's value
        last = new Node(); // create a new node and assign it to last
        last.item = item; //assign the item to that last node

        if (isEmpty()) { // if the linked list is empty
            first = last; // assign the value of last to first as well
        } else {
            prevLast.next = last; // we then point the old last node to the new last node, linking it

        }
        numItems++;
    }


    // === CHECK AND REPORT IF EMPTY ===

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    // === REMOVE THE LAST NODE THAT WAS ADDED ===
    @Override
    public Object pop() {
        
          if (isEmpty()){
            throw new NoSuchElementException("Nothing to pop!") ;
          }
        Node nodeToPop = last; //the node we want to pop is the last one
        if (numItems == 1){ //if there is just one item 
            first = last; //first equals last
        }else {
        last = getNode(numItems-2); //the new last is the second to last node
        }
        nodeToPop = null;//set the null to pop as null
        numItems-- ;
        return nodeToPop;

    }

    // === GET THE NUMBER OF ITEMS IN THE LIST ===
    @Override
    public int size() {
        return numItems;
    }

    private Node getNode(int index) {
        if (index > numItems - 1 || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds. Must be between 0 and "
                    + (numItems - 1) + " inclusive.");
        }
        Node nodeAtIndex = first;
        for (int i = 0; i < index; i++) {
            nodeAtIndex = nodeAtIndex.next;
        }
        return nodeAtIndex;
    }
    
        // === 
    @Override
    public Object get(int index) {
        return getNode(index).item;
    }

}
