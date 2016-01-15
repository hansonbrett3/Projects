/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.dao;

import com.thesoftwareguild.flooringmastery.dto.Product;
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
public class ProductInfo {

    Map<String, Product> products;
    private final String PRODUCT_FILE_NAME = "productfile.txt";
    private final String DELIMITER = ",";

    public ProductInfo() throws FileNotFoundException
    {
        products = new HashMap<>();
        readProductFile();
    }

    private void readProductFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(PRODUCT_FILE_NAME)));
        while (sc.hasNextLine()){
            String[] processed = sc.nextLine().split(DELIMITER);
            products.put(processed[0], new Product(processed[0], Double.parseDouble(processed[1]), Double.parseDouble(processed[2])));
        }
        
    
    }

    public List<Product> getAllProducts() {
        List<Product> output = new ArrayList<>();
        for (String productName : products.keySet()) {
            output.add(products.get(productName));
        }

        return output;
    }
    
    public Product getProductByName (String productName){
        return products.get(productName);
    }
    
    public Set<String> getKeySet(){
        return products.keySet();
    }

}
