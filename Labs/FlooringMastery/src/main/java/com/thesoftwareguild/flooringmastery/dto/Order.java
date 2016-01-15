/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.dto;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author apprentice
 */
public class Order {

    private int orderNumber;
    private String customerName;
    private String state;
    private double area;
    private double total;
    private Product product;
    private LocalDate date;
    private char flag;

    public Order(String customerName, String state, double area, double total, Product product, LocalDate date) {
        this.customerName = customerName;
        this.state = state;
        this.area = area;
        this.total = total;
        this.product = product;
        this.date = date;
    }

    public Order(int orderNumber, String customerName, String state, double area, double total, Product product, LocalDate date) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.state = state;
        this.area = area;
        this.total = total;
        this.product = product;
        this.date = date;
    }


    public String toStringWithoutOrderNumber() {
        String preFormat = customerName + ", " + state + ", Area: " + area + ", Total Cost: $" + "%.2f (Material cost: $%.2f, Labor cost: $%.2f, "
                + "Tax: $%.2f)" + ", Product Used: "
                + product.getProductType() + ", " + date.toString();

        return String.format(preFormat, total, product.getCostPerSquareFoot() * area, product.getLaborCostPerSquareFoot() * area,
                total - product.getCostPerSquareFoot() * area - product.getLaborCostPerSquareFoot() * area);

    }

    public String toString() {
        String preFormat = orderNumber + "\t" + customerName + ", " + state + ", Area: " + area + ", Total Cost: $" + "%.2f (Material cost: $%.2f, Labor cost: $%.2f, "
                + "Tax: $%.2f)" + ", Product Used: "
                + product.getProductType() + ", " + date.toString();

        return String.format(preFormat, total, product.getCostPerSquareFoot() * area, product.getLaborCostPerSquareFoot() * area,
                total - product.getCostPerSquareFoot() * area - product.getLaborCostPerSquareFoot() * area);
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
