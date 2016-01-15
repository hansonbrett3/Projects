/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.linkedlistqueue;

/**
 *
 * @author apprentice
 */
public class LinkedListQueue implements LinkedList {

    private Node first;
    private Node last;
    private int numItems = 0;

    @Override
    public void enqueue(Object item) {
        Node prevLast = last;

        if (isEmpty()) {
            first = last; //if this is the first Node, we assign the value of last to first as well
        } else {
            prevLast.next = last; // we then point the old last node to the new last node, linking it
        }

        last = new Node();
        last.item = item;

        numItems++;

    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = first == last;
        return isEmpty;
    }

    @Override
    public Object dequeue() {

        Node oldFirst = first;
        Node newFirst = oldFirst.next;
        first = newFirst;
        oldFirst = null;
        numItems--;
        return oldFirst;
    }

    @Override
    public int size() {
        return numItems;
    }

    private class Node {

        Object item;
        Node next;
    }

}
