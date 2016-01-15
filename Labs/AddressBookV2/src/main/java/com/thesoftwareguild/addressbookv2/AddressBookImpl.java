/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookv2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author bretthanson
 */
public class AddressBookImpl implements AddressBookDao {

    List<Address> addressList = new ArrayList();
    final private String BOOK_FILE = "book.text";
    final private String DELIMITER = "::";

    @Override
    public void loadBook() throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(BOOK_FILE)));

        int maxId = 0;

        while (sc.hasNextLine()) {

            String currentLine = sc.nextLine();
            String[] currentTokens = currentLine.split(DELIMITER);

            Address currentAddress = new Address(Integer.parseInt(currentTokens[0]));

            currentAddress.setFirstName(currentTokens[1]);
            currentAddress.setLastName(currentTokens[2]);
            currentAddress.setStreetAddress(currentTokens[3]);
            currentAddress.setCity(currentTokens[4]);
            currentAddress.setState(currentTokens[5]);
            currentAddress.setZipCode(currentTokens[6]);

            addressList.add(currentAddress.getAddressId(), currentAddress);
        }
    }

    @Override
    public void writeBook() throws IOException {
        PrintWriter write = new PrintWriter(new FileWriter(BOOK_FILE));

        addressList = getAllAddresses();
        Iterator iter = addressList.iterator();

        while (iter.hasNext()) {
            Address currentAddress = (Address) iter.next();

            write.println(currentAddress.getAddressId() + DELIMITER
                    + currentAddress.getFirstName() + DELIMITER
                    + currentAddress.getLastName() + DELIMITER
                    + currentAddress.getStreetAddress() + DELIMITER
                    + currentAddress.getCity() + DELIMITER
                    + currentAddress.getState() + DELIMITER
                    + currentAddress.getZipCode());
            write.flush();

        }
        write.close();
    }

    @Override
    public Address getAddress(String addressId) {
        Optional<Address> oAddress = addressList.stream()
//                .filter(address -> address.getAddressId() == addressId)
                .findFirst();
        if (oAddress.isPresent()) {

            return oAddress.get();
        }

        return null;
    }
    

    @Override
    public Address addAddress(String addressId, Address address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Address removeAddress(String addressId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Address> getAllAddressIds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Address> getAddressByLastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Address> getAddressByCity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, List<Address>> getAddressByState(String state) {
        return addressList.stream()
                .filter(a -> a.getState().equalsIgnoreCase(state))
                .collect(Collectors.groupingBy(a -> a.getCity()));
    }

    @Override
    public List<Address> getAddressByZipcode(String zipCode) {
        return addressList.stream()
                .filter(a -> a.getZipCode().equalsIgnoreCase(zipCode))
                .collect(Collectors.toList());
    }

    @Override
    public Integer getAddressCount() {
        return addressList.size();
    }

    private List<Address> getAllAddresses() {
        return addressList.stream()
                .collect(Collectors.toList());
    }

    @Override
    public void addAddress(Address currentAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
