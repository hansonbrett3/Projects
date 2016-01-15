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
public class LLQ_App {

    public static void main(String[] args) {

        LinkedListQueue llq = new LinkedListQueue();

        String jon = "Jonathan";
        String cait = "Caitlin";
        String ernie = "Ernest";

        System.out.println("Adding " + jon);
        llq.enqueue(jon);
        System.out.println("The size is now " + llq.size());
        System.out.println("Adding " + cait);
        llq.enqueue(cait);
        System.out.println("The size is now " + llq.size());
        System.out.println("Adding " + ernie);
        llq.enqueue(ernie);
        System.out.println("The size is now " + llq.size());
        llq.dequeue();
        System.out.println("The size is now " + llq.size());
        

    }

}
