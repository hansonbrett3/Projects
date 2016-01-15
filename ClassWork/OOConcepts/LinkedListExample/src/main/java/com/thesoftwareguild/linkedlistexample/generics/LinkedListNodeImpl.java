/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlistexample.generics;

import com.thesoftwareguild.linkedlistexample.*;
import java.util.Iterator;

/**
 *
 * @author apprentice
 */
public class LinkedListNodeImpl<Item>implements LinkedList<Item>{

    private Node<Item> first;
    private Node<Item>last;
    private int numItems = 0;

    @Override
    public void append(Item item) {

        Node <Item>prevLast = last;
        last = new Node<>();
        last.item = item;

        if (isEmpty()) {
            first = last;
        } else {
            prevLast.next = last;
        }
        prevLast.next = last;
        numItems++;
    }

    @Override
    public Item get(int index) {
//        if (index==0)
//        {
//            return first.item;
//        } else if (index == numItems - 1)
//        {
//            return last.item;
//        } else {
        return getNode(index).item;
//        }
    }

    @Override
    public void insert(int index, Item item) {
        if (index == numItems - 1) {
            append(item);
        } else {
            Node nodeAtIndex = getNode(index);
            //1
            Node newNode = new Node();
            //2
            newNode.item = item;
            //3
            newNode.next = nodeAtIndex.next;
            //4
            nodeAtIndex.next = newNode;
            numItems++;
        }
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void prepend(Item item) {
        Node prevFirst = first;
        first = new Node();
        first.item = item;
        first.next = prevFirst;
        numItems++;

        if (numItems == 1) {
            last = first;
        }

    }

    @Override
    public Item remove(int index) {
        Item item = null;
        if (index == 0) {
            item = first.item;
            first = first.next;
            // we removed the first item and there was only one item in the linked list
            if (index == numItems - 1) {
                last = null;
            }
        } else {

            Node<Item>nodeBefore = getNode(index - 1);

            item = nodeBefore.next.item;

            nodeBefore.next = nodeBefore.next.next;

            if (index == numItems - 1) {
                last = nodeBefore;
            }
        }
        numItems--;
        return item;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private class Node <NodeItem>{

        NodeItem item;
        Node <NodeItem>next;
    }

    private Node <Item>getNode(int index) {
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
    
    
    private class LinkedListIterator <T> implements Iterator
    {
        Node <Item>current = first;
        
        
           @Override
        public boolean hasNext() {
        return current != null;
        }

        @Override
        public Item next() {
        if (current == null)
        {
            return null;
        }
        Item item = current.item;
        current = current.next;
        return item;
        }
    }
}
