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
    
    public ArrayStack()
    {
        this(DEFAULT_INITIAL_SIZE); // calls its own constructor and passes in its initial size...NEED CLARIFICATION
    }
    
    public ArrayStack(int size)
    {
        items = new Object[size];
    }
    
    
    
    @Override
    public void push(Object o) {
        if (numItems == items.length)
        {
            resize(2*items.length);
        }
        items [numItems] = o;
        numItems++;
    }

    @Override
    public Object pop(Object) {
        if (numItems == 0)
        {
            return null;
        }
        Object item = items[--numItems];
        items[numItems] = null;
        if (numItems>0 && numItems == items.length/4)
        {
            resize(items.length/2);
        }
        return item;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }
    
    private void resize(int newSize)
    {
        Object[] temp = new Object[newSize];
        for (int i=0;  i<numItems; i++)
        {
            temp[i] = items[i];
        }
        items = temp;
    }
    
    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class ReverseArrayIterator implements Iterator {

        
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
