/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.flooringapp;

import com.thesoftwareguild.controller.FlooringController;
import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public class App {
    
    public static void main(String[] args) throws FileNotFoundException, Exception{
        
    FlooringController controller= new FlooringController();
    controller.run();
    }
}

