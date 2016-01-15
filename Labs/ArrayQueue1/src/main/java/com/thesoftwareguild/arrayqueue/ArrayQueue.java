/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.arrayqueue;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayQueue implements QueueInterface {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] itemArray;
    private int numItems;
    private int head = 0; // index of the current front item, if one exists
    private int tail = 0; // index of next item to be added

    Iterator revItr = new ReverseArrayIterator();
    Iterator fwdItr = new ForwardArrayIterator();

    // default constructor, which creates an array that is the size of the value of DEFAULT_INITIAL_SIZE
    public ArrayQueue() {
        this(DEFAULT_INITIAL_SIZE);
    }

    // constructor that takes a size parameter and creates an array that is the size of the value of that parameter
    public ArrayQueue(int size) {
        itemArray = new Object[size];
    }

    // === ENQUEUE ===
    @Override
    public void enqueue(Object object) {
        if (numItems == itemArray.length) { //first check to see if the number of itemArray is the same as the length of the array
            resize(2 * itemArray.length); //if so, then double the size of the array and reassign the values 
        }

        itemArray[tail] = object; //the object gets placed in the tail location
        ++tail; //the tail value is incremented
        
        if (tail == itemArray.length-1 && head > 0) { // if the tail location is the same as the length of the array and the head location is greater than 0
            tail = 0; // tail gets moved to index 0
        }

        numItems++; //the counter for number of items is also incremented
    }

    // === DEQUEUE ===
    @Override
    public Object dequeue() {
        
        if (numItems == 0) { //if the number of items in the array is zero
            return null; //return null            
        }
        
        Object item = itemArray[head]; //declare an instantiate a new object reference named item that is located in the array where head is the index number
        itemArray[head] = null; //set that index location in the array to null
        
        ++head; // increment the head counter so that it goes to the next index location in the array
        
         if (head == itemArray.length) { 
            head = 0;
        }
        
        numItems--; // decrement the counter of items in the array
        
        if ( tail == itemArray.length){
        tail = head - 1;
        }
        
        if (itemArray.length-1 > 7 && numItems == itemArray.length / 4) { // if the number of items is greater than 8 and the number of items is equal to 1/4 the size of the array
            resize(itemArray.length / 2); // halve the size of the array
            head = 0; //this resets the head
            tail = numItems; // this sets the tail
            
              }
        
        return item; //return the item that was dequeued from the array index equal to the value held in the head variable
    
    }

    // === HOW MANY ITEMS ARE IN ARRAY ===
    @Override
    public int size() {
        return numItems;
    }

    // === IS ARRAY EMPTY
    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    // === RESIZE THE ARRAY ===
    private void resize(int newSize) {
        Object[] temp = new Object[newSize]; //create new array that is bigger/smaller
        int headLocation = head; // create new variable headLocation to store old head location
        for (int i = 0; i < numItems; i++) { //loop through as many times as there are items

            temp[i] = itemArray[headLocation];
            headLocation++;

            //this will only put in the head value
            //we need to assign the values of the old array into the new array
            //we should start at the head value, continue to the end of the old array
            //then we start at the beginning of the old array until we reach the head.
        }

        itemArray = temp;
    }

    // == REVERSE ITERATOR ===
    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator(); //gets a new iterator for us to deploy with the methods below
    }

    private class ReverseArrayIterator implements Iterator {

        private int i = numItems; //sets i equal to the number of items

        @Override
        public boolean hasNext() {
            return i > 0; //as long as there are items, the iterator will go to the next item
        }

        @Override
        public Object next() {
            i--; //this decrements the value of i
            return itemArray[i]; //this returns the item in idex i. Because i decrements, this method combined with the one above goes backwards
        }
    }

    // === FORWARD ITERATOR ===
    public Iterator forwardIterator() {
        return new ForwardArrayIterator(); //gets a new iterator for us to deploy with the methods below
    }

    private class ForwardArrayIterator implements Iterator {

        private int i = head; //initialize i to the head

        @Override
        public boolean hasNext() {
            boolean keepGoing = true;
            for (Object item : itemArray) {
                //go through the array until you get to the tail
                keepGoing = item != null;
            }
            return keepGoing;
        }

        @Override
        public Object next() {
            i++; //this increments the value of i
            return itemArray[i]; //this returns the item in idex i. Because i decrements, this method combined with the one above goes backwards
        }
    }
}
