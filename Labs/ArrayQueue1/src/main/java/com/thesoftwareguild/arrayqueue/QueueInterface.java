/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.arrayqueue;

/**
 *
 * @author apprentice
 */
public interface QueueInterface extends Iterable {
    public void enqueue(Object object);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
}
