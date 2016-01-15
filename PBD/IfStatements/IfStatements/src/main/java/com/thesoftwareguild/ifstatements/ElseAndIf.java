/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ifstatements;

/**
 *
 * @author apprentice
 */
public class ElseAndIf {

    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;

        if (cars > people) {
            System.out.println("We should take the cars.");
        } else if (cars < people) {
            System.out.println("We can't decide.");
        } else {
            System.out.println("That's too many buses.");
        }

    }

}
