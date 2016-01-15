/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.ArrayExamples;

/**
 *
 * @author apprentice
 */
public class ArrayExamples {
    
    public static void main(String[] args) {
        
        int[] teamScores; // Declare Variable

        teamScores = new int[10]; // Set Array 

        teamScores[0] = 2;
        teamScores[1] = 45;
        teamScores[2] = 4;
        teamScores[3] = 8;
        teamScores[4] = 99;
        teamScores[5] = 23;
        teamScores[6] = 67;
        teamScores[7] = 1;
        teamScores[8] = 88;
        teamScores[9] = 42;

        int[] testArray = {2, 45, 4, 8, 99,
            23, 67, 1, 88, 42
        };
        // can only declare and initialize inline  
//        teamScores = {2, 45, 4, 8, 99, 
//       23, 67, 1, 88, 42
//       };
        int currentScore = teamScores[4];

        teamScores[4] = 109;

        for (int i = 0; i < teamScores.length; i++) {

            System.out.println("Element " + i + " = " + teamScores[i]);
        }

        for (int score : teamScores) {
            System.out.println("element = " + score);
        }

        String[] sampleText = {"test", "enhanced", "for", "loop", "to", "display", "it's", "function"};

        for (String word : sampleText) {
            System.out.println(word);
        }

        for (int i = teamScores.length / 2; i < teamScores.length; i++) {
            System.out.println("Element " + i + " = " + teamScores[i]);
        }

        String[][] cityTeamNames = {
            {"Cleveland", "Browns", "Cavs", "Indians"},
            {"Columbus", "Bluejackets", "Buckeyes"},
            {"Pittsburgh", "Steelers", "Pirates", "Penguins"}
        };

        for (int i = 0; i < cityTeamNames.length; i++) {
            for (int j = 0; j < cityTeamNames[i].length; j++) {
                System.out.println(cityTeamNames[i][j] + " ");

                System.out.println("");
            }
        }
    }
}

    
    



            
               




    
    
    
    
               
 
    
    

