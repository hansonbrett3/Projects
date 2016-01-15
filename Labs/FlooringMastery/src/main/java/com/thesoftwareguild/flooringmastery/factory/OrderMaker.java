/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.factory;

import com.thesoftwareguild.flooringmastery.dao.*;
import com.thesoftwareguild.flooringmastery.dto.*;
import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author apprentice
 */
public class OrderMaker {
    
    private final ProductInfo productInfo;
    private final TaxInfo taxInfo;
    
    public OrderMaker() throws FileNotFoundException{
        productInfo = new ProductInfo();
        taxInfo = new TaxInfo();
    }
    
    public Order makeOrder(String customerName, String state, double area, String productName, LocalDate date){
        Product productUsed = productInfo.getProductByName(productName);
        Tax taxUsed = taxInfo.getTaxByState(state);
        
        return new Order(customerName, state, area, 
        //calculation for the total
            (1+taxUsed.getTaxRate()/(double)100)*(area)*(productUsed.getCostPerSquareFoot()+productUsed.getLaborCostPerSquareFoot()), 
                productUsed, date);
    }
    
    public Order makeOrderWithID(int orderID, String customerName, String state, double area, String productName, LocalDate date){
        Product productUsed = productInfo.getProductByName(productName);
        Tax taxUsed = taxInfo.getTaxByState(state);
        
        return new Order(orderID, customerName, state, area, 
        //calculation for the total
            (1+taxUsed.getTaxRate()/(double)100)*(area)*(productUsed.getCostPerSquareFoot()+productUsed.getLaborCostPerSquareFoot()), 
                productUsed, date);
    }
    
}
