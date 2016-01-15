/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.simplecalculatorwithconsoleio;

/**
 *
 * @author apprentice
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {

    private String stringInput;
    private int intInput;
    private double doubleInput;
    private float floatInput;
    private String stringPrompt;

    public String getStringInput() {
        return stringInput;
    }

    public void setStringInput(String stringInput) {
        this.stringInput = stringInput;
    }

    public int getIntInput(String stringPrompt) {
        int reloop = 0;
        do {
            Scanner input = new Scanner(System.in);
            try {
                setStringPrompt(stringPrompt);
                intInput = input.nextInt();
                reloop++;

            } catch (Exception e) {
                System.out.println("That is not an integer");
            }
        } while (reloop == 0);

        return intInput;
    }

    public void setIntInput(int intInput) {
        this.intInput = intInput;
    }

    public double getDoubleInput(String stringPrompt) {
        int reloop = 0;
        do {
            Scanner input = new Scanner(System.in);
            try {
                setStringPrompt(stringPrompt);
                doubleInput = input.nextDouble();
                reloop++;
            } catch (Exception e) {
                System.out.println("That is not a double");
            }
        } while (reloop == 0);
        return doubleInput;
    }

    public void setDoubleInput(double doubleInput) {
        this.doubleInput = doubleInput;
    }

    public float getFloatInput(String stringPrompt) {
        int reloop = 0;
        do {
            Scanner input = new Scanner(System.in);
            try {
                setStringPrompt(stringPrompt);
                floatInput = input.nextFloat();
                reloop++;
            } catch (Exception e) {
                System.out.println("That is not a float");
            }
        } while (reloop == 0);
        return floatInput;
    }

    public void setFloatInput(float floatInput) {
        this.floatInput = floatInput;
    }

    public String getStringPrompt() {
        return stringPrompt;
    }

    public void setStringPrompt(String stringPrompt) {
        this.stringPrompt = stringPrompt;
        System.out.println("Please enter a(n) " + stringPrompt);
    }

    public float getFloatWithinRange(String stringPrompt, float floatMin, float floatMax) {
        float tempFloat;
        do {
            tempFloat = getFloatInput(stringPrompt);
            if (tempFloat >= floatMin && tempFloat <= floatMax) {
                floatInput = tempFloat;
            } else {
                System.out.println("That is not within the range.");
            }
        } while (tempFloat < floatMin || tempFloat > floatMax);
        return floatInput;
    }

    public int getIntWithinRange(String stringPrompt, int intMin, int intMax) {
        int tempInt;
        do {
            tempInt = getIntInput(stringPrompt);
            if (tempInt >= intMin && tempInt <= intMax) {
                intInput = tempInt;
            } else {
                System.out.println("That is not within range. ");
            }
        } while (tempInt < intMin || tempInt > intMax);
        return intInput;
    }

    public double getDoubleWithinRange(String stringPrompt, double doubleMin, double doubleMax) {
        double tempDouble; 
        do {
            tempDouble = getDoubleInput(stringPrompt);
            if (tempDouble >= doubleMin && tempDouble <= doubleMax) {
                doubleInput = tempDouble;
            } else {
                System.out.println("That is not within range. ");
            }
        } while (tempDouble < doubleMin || tempDouble > doubleMax);
        return doubleInput;
    }

}