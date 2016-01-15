/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbook;

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
public class AddressBook {

    public static final String BOOK_FILE = "book.txt";

    public static final String DELIMITER = "::";

    private HashMap<String, Address> addresses = new HashMap<String, Address>();

    public void loadBook() throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(BOOK_FILE)));

        String currentLine;

        String[] currentTokens;

        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Address currentAddress = new Address(currentTokens[0]);

            currentAddress.setFirstName(currentTokens[1]);
            currentAddress.setLastName(currentTokens[2]);
            currentAddress.setStreetAddress(currentTokens[3]);
            currentAddress.setCity(currentTokens[4]);
            currentAddress.setState(currentTokens[5]);
            currentAddress.setZipCode(currentTokens[6]);

            addresses.put(currentAddress.getAddressId(), currentAddress);
        }
        sc.close();
    }

    public void writeBook() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(BOOK_FILE));

        String[] keys = this.getAllAddressIds();

        for (int i = 0; i < keys.length; i++) {

            Address currentAddress = this.getAddress(keys[i]);

            out.println(currentAddress.getAddressId() + DELIMITER
                    + currentAddress.getFirstName() + DELIMITER
                    + currentAddress.getLastName() + DELIMITER
                    + currentAddress.getStreetAddress() + DELIMITER
                    + currentAddress.getCity() + DELIMITER
                    + currentAddress.getState() + DELIMITER
                    + currentAddress.getZipCode());
            out.flush();
        }
        out.close();

    }

    public Address getAddress(String addressId) {
        return addresses.get(addressId);
    }

    public Address addAddress(String addressId, Address address) {
        return addresses.put(addressId, address);
    }

    public Address removeAddress(String addressId) {
        return addresses.remove(addressId);
    }

    public String[] getAllAddressIds() {
        Set<String> keySet = addresses.keySet();
        String[] keyArray = new String[keySet.size()];
        keyArray = keySet.toArray(keyArray);

        return keyArray;
    }

}
