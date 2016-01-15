/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.addressbookv2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bretthanson
 */
public interface AddressBookDao {

    public void loadBook() throws FileNotFoundException;

    public void writeBook() throws IOException;

    public Address getAddress(String addressId);

    public Address addAddress(String addressId, Address address);

    public Address removeAddress(String addressId);

    public List<Address> getAllAddressIds();

    public List<Address> getAddressByLastName(String lastName);

    public List<Address> getAddressByCity(String city);

    public Map<String, List<Address>> getAddressByState(String state); 

    public List<Address> getAddressByZipcode(String zipCode);

    public Integer getAddressCount();

    public void addAddress(Address currentAddress);

}
