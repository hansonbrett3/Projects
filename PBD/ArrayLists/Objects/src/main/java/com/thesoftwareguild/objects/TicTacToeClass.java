/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.objects;

/**
 *
 * @author apprentice
 */
public class TicTacToeClass {
    // Instaance Variables
    private char [] [] board;
    private int turns;
    
    // Constructors
    public TicTacToeClass() {
        board = new char [3] [3];
        turns = 0;
        
        for (int r=0; r<3; r++)
            for (int c=0; c<3; c++)
                board [r] [c] = " ";
    }
    
    // Accessor Methods
    
    public boolean isWinner (char p)
    {
        return false;
    }
    
    public boolean isFull()
    {
        return false;
    }
    
    public boolean isCat()
    {
        return false;
    }
    
    public boolean isValid(int r, int c) 
    {
        if (0<=r && r<= 2 && 0<= c && c<=2)
            return true;
        else 
            return false;
    }
    
    public int numTurns()
    {
        return turns;
    }
    
    public char playerAt(int r, int c) 
    {
        if (isValid(r,c))
            return board [r] [c];
        else 
            return '@';
    }
    
    public void displayBoard()
    {
        System.out.println(" 0  " +board[0] [0] + "|" + board[0] [1] + "|" + board[0] [2]); 
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    
    
    
}
