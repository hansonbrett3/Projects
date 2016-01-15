/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author bretthanson
 */
public class DvdLibrary {

    public static final String LIBRARY_FILE = "library.txt";

    public static final String DELIMITER = "::";

    private HashMap<String, Dvd> dvds = new HashMap<String, Dvd>();

    public void loadLibrary() throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));

        String currentLine;

        String[] currentTokens;

        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Dvd currentDvd = new Dvd(currentTokens[0]);

            currentDvd.setTitle(currentTokens[1]);
            currentDvd.setReleaseDate(currentTokens[2]);
            currentDvd.setMpaaRating(currentTokens[3]);
            currentDvd.setDirector(currentTokens[4]);
            currentDvd.setStudio(currentTokens[5]);
            currentDvd.setUserRating(currentTokens[6]);

            dvds.put(currentDvd.getDvdId(), currentDvd);
        }
        sc.close();
    }

    public void writeLibrary() throws IOException {

        PrintWriter out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        
        String[] keys = this.getAllDvdIds();

        for (int i = 0; i < keys.length; i++) {

            Dvd currentDvd = this.getDvd(keys[i]);

            out.println(currentDvd.getDvdId() + DELIMITER
                    + currentDvd.getTitle() + DELIMITER
                    + currentDvd.getReleaseDate() + DELIMITER
                    + currentDvd.getMpaaRating() + DELIMITER
                    + currentDvd.getDirector() + DELIMITER
                    + currentDvd.getStudio() + DELIMITER
                    + currentDvd.getUserRating());
            out.flush();
        }
        out.close();
    }

    public Dvd getDvd(String dvdId) 
    {
        return dvds.get(dvdId);
    }

    public Dvd addDvd(String dvdId, Dvd dvd) 
    {
        return dvds.put(dvdId, dvd);
    }

    public Dvd removeDvd(String dvdId) 
    {
        return dvds.remove(dvdId);
    }

    public String[] getAllDvdIds() 
    {
        Set<String> keySet = dvds.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray = keySet.toArray(keyArray);
        
        return keyArray;
    }

}
