/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild._xsandys;

/**
 *
 * @author bretthanson
 */
public class XsAndYs {

    public static void main(String[] args) {
        for (double x = -10; x <= 10; x += 0.5) {
            double y = x*x;
            System.out.println(x + "\t" + y);
        }
    }

}
