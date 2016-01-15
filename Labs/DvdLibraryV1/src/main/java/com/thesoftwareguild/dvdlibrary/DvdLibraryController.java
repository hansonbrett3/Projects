/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrary;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author bretthanson
 */
public class DvdLibraryController {

    private DvdLibrary library = new DvdLibrary();

    private ConsoleIO con = new ConsoleIO();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            library.loadLibrary();
            while (keepGoing) {
                printMenu();
                menuSelection = con.readInt("Please select from the above choices.", 1, 5);

                switch (menuSelection) {
                    case 1:
                        con.print("Listing Dvd IDs...");
                        listDvds();
                        break;
                    case 2:
                        con.print("Create New Dvd...");
                        createDvd();
                        break;
                    case 3:
                        con.print("Viewing Dvd Information...");
                        viewDvd();
                        break;
                    case 4:
                        con.print("Removing Student....");
                        removeDvd();
                        break;
                    case 5:
                        con.print("Exiting...");
                        keepGoing = false;
                        break;
                    default:
                        con.print("Unknown Command...");
                }

            }
            con.print("Thanks for playing...");
            library.writeLibrary();
        } catch (FileNotFoundException ex) {
            System.out.println("Error loading file");
        } catch (IOException ex) {
            System.out.println("Error writing to file");
        }
    }

    private void printMenu() {
        con.print("Main Menu");
        con.print("1. List DVD IDs");
        con.print("2. Create New DVD");
        con.print("3. View a DVD");
        con.print("4. Remove a DVD");
        con.print("5. Exit");
    }

    private void listDvds() {
        String[] dvdIds = library.getAllDvdIds();
        for (int i = 0; i < dvdIds.length; i++) {
            Dvd currentDvd = library.getDvd(dvdIds[i]);
            con.print(dvdIds[i] + ": " + currentDvd.getTitle() + " | " + currentDvd.getReleaseDate() + " | " + currentDvd.getMpaaRating() + " | " + currentDvd.getDirector() + " | " + currentDvd.getStudio() + " | " + currentDvd.getUserRating());
        }
    }

    private void viewDvd() {
        String dvdId = con.readString("Please enter the ID of the DVD you wish to veiw.");
        Dvd currentDvd = library.getDvd(dvdId);
        if (currentDvd != null) {
            con.print(currentDvd.getDvdId());
                    
            con.print(currentDvd.getTitle());
            con.print(currentDvd.getReleaseDate());
            con.print(currentDvd.getMpaaRating());
            con.print(currentDvd.getDirector());
            con.print(currentDvd.getStudio());
            con.print(currentDvd.getUserRating());
            con.print("");
        } else {
            con.print("No DVD with ID: " + dvdId);
        }
        con.readString("Please hit enter to continue.");
    }

    private void createDvd() {
        String dvdId = con.readString("Please enter DVD ID");
        String title = con.readString("Please enter Title");
        String releaseDate = con.readString("Please enter Release Date");
        String mpaaRating = con.readString("Please enter MPAA Rating");
        String director = con.readString("Please enter Director");
        String studio = con.readString("Please enter Studio");
        String userRating = con.readString("Please enter User Rating");
        Dvd currentDvd = new Dvd(dvdId);
        currentDvd.setTitle(title);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setMpaaRating(mpaaRating);
        currentDvd.setDirector(director);
        currentDvd.setStudio(studio);
        currentDvd.setUserRating(userRating);
        library.addDvd(dvdId, currentDvd);
        con.readString("DVD successfully created.  Please hit enter to continue.");
    }

    private void removeDvd() {
        String dvdId = con.readString("Please enter the ID of the DVD to be removed");
        library.removeDvd(dvdId);
        con.readString("DVD successfully removed.  Please hit enter to continue.");
    }

}

