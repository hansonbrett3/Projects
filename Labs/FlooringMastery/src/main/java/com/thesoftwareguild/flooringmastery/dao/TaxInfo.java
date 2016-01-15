/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.dao;

import com.thesoftwareguild.flooringmastery.dto.Tax;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class TaxInfo {
    
    Map<String, Tax> taxRates;
    private final String TAX_FILE_NAME = "taxfile.txt";
    private final String DELIMITER = ",";

    public TaxInfo() throws FileNotFoundException{
        taxRates = new HashMap<>();
        readTaxFile();
    }

    private void readTaxFile() throws FileNotFoundException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(TAX_FILE_NAME)));
        while (sc.hasNextLine()){
            String[] processed = sc.nextLine().split(DELIMITER);
            taxRates.put(processed[0], new Tax(processed[0], Double.parseDouble(processed[1])));
        }}
    
    public List<Tax> getAllTax(){
        List<Tax> output = new ArrayList<>();
        for (String state: taxRates.keySet())
            output.add(taxRates.get(state));
        
        return output;
    }
    
    public Tax getTaxByState(String state){
        return taxRates.get(state);
    }
    
    public Set<String> getKeySet(){
        return taxRates.keySet();
    }
    
    
}
