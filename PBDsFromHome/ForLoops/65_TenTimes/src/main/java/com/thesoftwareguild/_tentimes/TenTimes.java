/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._tentimes;

/**
 *
 * @author bretthanson
 */
public class TenTimes {
    public static void main(String[] args) {
        String phrase = "Mr. Mitchell is cool";
        
        for (int i = 1; i<=10; i++) {
            System.out.println(i + ". " + phrase);
        }
    }
}
