/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thesoftwareguild.interfacesexample;

/**
 *
 * @author apprentice
 */

//You class can only inherent one class but able to implement multiple classes//

public class App {
    public static void main(String[] args) {
        
        Debuggable con = new ConsoleLogger();
        
        con.displayError("All had failed!!!");
        con.displayError("Just what that error said. ");
        
        DebugLogging con2 = new PersistentConsoleLogger();
        
        con2.displayError("con 2 error");
        con2.displayStatus("con2 status");
        con2.logError("Error for con2");
        con2.logStatus("con 2 status");
        
        con = con2;
        
        Colorable donkeyLobster = new Ball ( );
        donkeyLobster.setColor("pink");
        System.out.println("I set ball to " + donkeyLobster.getColor() + "color.");
        
        // How do we call a bounce method on donkeyLobster?
        Ball ball = (Ball) donkeyLobster;
        ball.bounce();
        
        ((Ball)donkeyLobster).bounce();
    }
    
}


/////  Your class must implement all of the methids defined for both Interfaces.
// Interfaces can be extrended in the same way that classes can be extended