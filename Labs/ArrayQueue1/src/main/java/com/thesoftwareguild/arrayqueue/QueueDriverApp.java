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
public class QueueDriverApp {

    public static void main(String[] args) {

        QueueInterface queue = new ArrayQueue();

        String bob = "Bob";
        String ernie = "Ernie";
        String cait = "Cait";
        String mary = "Mary";
        String tom = "Tom";
        String sam = "Sam";
        String jane = "Jane";
        String kim = "Kim";
        
        System.out.println("Is the array currently empty?");
        System.out.println("The computer says:" + queue.isEmpty());
        System.out.println("");        
        System.out.println("In that case, let's add a few objects!");
        
        System.out.println("Adding " + bob);
        queue.enqueue(bob);
        System.out.println("And now the array has " + queue.size() + " person in line.");
        System.out.println("Adding " + ernie);
        queue.enqueue(ernie);
        System.out.println("And now the array has " + queue.size() + " people in line.");
        System.out.println("Adding " + cait);
        queue.enqueue(cait);
        System.out.println("And now the array has " + queue.size() + " people in line.");
        System.out.println("Adding " + mary);
        queue.enqueue(mary);
        System.out.println("And now the array has " + queue.size() + " people in line.");
        System.out.println("");
        System.out.println("Uh oh, our array is full! I wonder what will happen if we try to fit in more people....");
        System.out.println("Adding " + tom);
        queue.enqueue(tom);
        System.out.println("And now the array has " + queue.size() + " people in line.");
        System.out.println("");
        System.out.println("Yay! It didn't blow up! Let's add another to be sure...");
        System.out.println("Adding " + sam);
        queue.enqueue(sam);
        System.out.println("And now the array has " + queue.size() + " people in line.");
        System.out.println("");
        System.out.println("Gee....that's a lot of people in the queue. Maybe we should clear some out!");
        
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        System.out.println("");
        System.out.println("Hmmm, I wonder if the array shrunk. I think it should have at this point. But how to check?");
        System.out.println("Maybe we can take out the rest of the people? Let's try it!");
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        queue.dequeue();
        System.out.println("There goes one person! Now our array is down to " + queue.size() + " people in line.");
        System.out.println("So, is our array empty again?");
        System.out.println("The computer says: " + queue.isEmpty());
    }
    

}
