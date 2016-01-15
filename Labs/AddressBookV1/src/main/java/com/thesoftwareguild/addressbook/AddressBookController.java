/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbook;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author bretthanson
 */
public class AddressBookController {

    private AddressBook book = new AddressBook();

    private ConsoleIO con = new ConsoleIO();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            book.loadBook();
            while (keepGoing) {
                printMenu();
                menuSelection = con.readInt("Please select from the above choices.", 1, 5);

                switch (menuSelection) {
                    case 1:
                        con.print("Listing Address IDs...");
                        listAddresses();
                        break;
                    case 2:
                        con.print("Create New Address...");
                        createAddress();
                        break;
                    case 3:
                        con.print("Viewing Address Information...");
                        viewAddress();
                        break;
                    case 4:
                        con.print("Removing Address...");
                        removeAddress();
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
            book.writeBook();
        } catch (FileNotFoundException ex) {
            System.out.println("Error loading file");
        } catch (IOException ex) {
            System.out.println("Error writing to file");
        }
    }

    private void printMenu() {
        con.print("Main Menu");
        con.print("1. List Address Ids");
        con.print("2. Create New Address");
        con.print("3. View an Address");
        con.print("4. Remove an Address");
        con.print("5. Exit");
    }

    private void listAddresses() {
        String[] addressIds = book.getAllAddressIds();
        for (int i = 0; i < addressIds.length; i++) {
            Address currentAddress = book.getAddress(addressIds[i]);
            con.print(addressIds[i] + ": " + currentAddress.getFirstName() + " | " + currentAddress.getLastName() + " | " + currentAddress.getStreetAddress() + " | " + currentAddress.getCity() + " | " + currentAddress.getState() + " | " + currentAddress.getZipCode());
        }
    }

    private void viewAddress() {
        String addressId = con.readString("Please enter the ID of the address that you would like to view");
        Address currentAddress = book.getAddress(addressId);
        if (currentAddress != null) {
            con.print(currentAddress.getAddressId());

            con.print(currentAddress.getFirstName());
            con.print(currentAddress.getLastName());
            con.print(currentAddress.getStreetAddress());
            con.print(currentAddress.getCity());
            con.print(currentAddress.getState());
            con.print(currentAddress.getZipCode());
            con.print("");
        } else {
            con.print("No Address with ID: " + addressId);
        }
        con.readString("Please hit enter to continue");
    }

    private void createAddress() {
        String addressId = con.readString("Please enter Address ID");
        String firstName = con.readString("Please enter First Name");
        String lastName = con.readString("Please enter Last Name");
        String streetAddress = con.readString("Please enter the Street Address");
        String city = con.readString("Please enter City");
        String state = con.readString("Please enter State");
        String zipCode = con.readString("Please enter Zip Code");
        Address currentAddress = new Address(addressId);
        currentAddress.setFirstName(firstName);
        currentAddress.setLastName(lastName);
        currentAddress.setStreetAddress(streetAddress);
        currentAddress.setCity(city);
        currentAddress.setState(state);
        currentAddress.setZipCode(zipCode);
        book.addAddress(addressId, currentAddress);
        con.readString("Address successfully created. Please hit enter to continue");
    }

    private void removeAddress() {
        String addressId = con.readString("Please enter the ID of the Address you would like to be removed");
        book.removeAddress(addressId);
        con.readString("Address successfully removed. Please Hit enter to continue");
    }

}
