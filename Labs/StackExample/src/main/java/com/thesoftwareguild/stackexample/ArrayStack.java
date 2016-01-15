/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.stackexample;

import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class ArrayStack implements StackInterface {
    
    
    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems;
   
    public ArrayStack(){
        this(DEFAULT_INITIAL_SIZE); //
    }
    
    public ArrayStack(int size){
        items = new Object[size];
    }
   
    

    @Override
    public void push(Object o) {
       if (numItems == items.length){
           resize(2*items.length);
       }
       items[numItems] = o; //this adds an object to the index that numItems currently represents
       numItems++; //this increments the value of numItems
    }

    @Override
    public Object pop() {
       if (numItems ==0){
           return null;
       }
       Object item = items[--numItems];
       items[numItems] = null;
       if (numItems>0 && numItems == items.length/4)
       {
           resize(items.length/2);
       }
       return item; //even though we are returning an ARRAY, it's ok because an Array is an Object! That is because the method is not type safe. 
       
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0; //if the number of items is zero, then isEmpty is true.
    }

    //this method creates a larger or smaller array to hold our values
    private void resize(int newSize) { //take parameter newSize, which is numItems times 2 from another method
        Object[] temp = new Object[newSize]; //create a new array and set it's size equal to the value of newSize
        for (int i = 0; i <numItems; i++) { // use a for loop to put the values from the old array into the new array
            temp[i] = items[i];
        }
        items = temp; //finally, reassign the new array to the variable name of the old array
        }

    @Override
    public Iterator iterator() { // this is going to return an object that has an iterator interface
       return new ReverseArrayIterator(); // iterators go through a collection only once
    }
    
    private class ReverseArrayIterator implements Iterator{ //this is a private inner class. It has access to class level variables of ArrayStack

        private int i = numItems;
        
        
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Object next() {
            i--;
            return items[i];
        }
        
    }
    
    }
    
