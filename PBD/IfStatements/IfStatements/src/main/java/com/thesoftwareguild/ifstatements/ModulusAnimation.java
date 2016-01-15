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
public class ModulusAnimation {

    public static void main(String[] args) throws Exception {

        int repeats = 5;
        int steps_per_second = 10;

        for (int i = 0; i < repeats * 11; i++) {
            if (i % 11 == 0) {
                System.out.println(" .oOo..... \r");
            } else if (i % 11 == 1) {
                System.out.println(" ..oOo.... \r");
            } else if (i % 11 == 2) {
                System.out.println(" ...oOo... \r");
            } else if (i % 11 == 3) {
                System.out.println(" ....oOo.. \r");
            } else if (i % 11 == 4) {
                System.out.println(" .....oOo. \r");
            } else if (i % 11 == 5) {
                System.out.println(" ......oOo \r");
            } else if (i % 11 == 6) {
                System.out.println(" .......oO \r");
            } else if (i % 11 == 7) {
                System.out.println(" o.......o \r");
            } else if (i % 11 == 8) {
                System.out.println(" Oo....... \r");
            } else if (i % 11 == 9) {
                System.out.println(" oOo...... \r");
            } else if (i % 11 == 10) {
                System.out.println(" .oOo..... \r");
            }
            Thread.sleep(1000 / steps_per_second);
        }
    }
}
