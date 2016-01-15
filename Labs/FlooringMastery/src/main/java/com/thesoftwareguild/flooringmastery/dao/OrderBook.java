/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.flooringmastery.dao;

import com.thesoftwareguild.flooringmastery.dto.Order;
import com.thesoftwareguild.flooringmastery.dto.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class OrderBook {

    public List<LocalDate> getDatesLoaded() {
        return datesLoaded;
    }
    
    

    private Map<Integer, Order> orders = new HashMap<Integer, Order>();
    private ProductInfo productInfo;
    private TaxInfo taxInfo;
    private List<LocalDate> datesLoaded = new ArrayList<>();
    private boolean isTesting;
    public List<Order> ordersAdded = new ArrayList<>();
    public List<Order> ordersRemoved = new ArrayList<>();
    public List<Order> ordersEdited = new ArrayList<>();

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    int idCounter;
    private final String DELIMITER = ",";
    public static final String FILE_PATH = "OrderFolder/";
    public static final String CONFIG_FILE = "idconfig.txt";

    public OrderBook() throws FileNotFoundException {
        productInfo = new ProductInfo();
        taxInfo = new TaxInfo();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(CONFIG_FILE)));
        idCounter = Integer.parseInt(sc.nextLine());
        isTesting = Boolean.parseBoolean(sc.nextLine());
    }

    public List<Order> getOrdersByDate(LocalDate date) throws FileNotFoundException {

        if (!datesLoaded.contains(date)) {
            loadOrderBook(date);

        }

        Set<Integer> list = orders.keySet();
        List<Order> output = new ArrayList();
        for (Integer orderNumber : list) {
            if (date.equals(orders.get(orderNumber).getDate())) {
                output.add(orders.get(orderNumber));
            }
        }
        return output;
    }

    public void addOrder(Order order) throws FileNotFoundException {

        File f = new File(FILE_PATH + "Orders_" + order.getDate().format(DateTimeFormatter.ofPattern("MMddYYYY")) + ".txt");

        if (f.exists() && !datesLoaded.contains(order.getDate())) {
            loadOrderBook(order.getDate());
        }

        order.setOrderNumber(idCounter);
        idCounter++;
        datesLoaded.add(order.getDate());
        ordersAdded.add(order);
        orders.put(order.getOrderNumber(), order);

    }

    public void loadOrderBook(LocalDate date) throws FileNotFoundException {
        if (isTesting)
            return;
        String fileName = FILE_PATH + "Orders_" + date.format(DateTimeFormatter.ofPattern("MMddYYYY")) + ".txt";
        Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] currentProcessedLine = currentLine.split(DELIMITER);
            Product product = productInfo.getProductByName(currentProcessedLine[4]);
            String customerName = currentProcessedLine[1].replace("&#44", ",");
            

            Order orderToAdd = new Order(Integer.parseInt(currentProcessedLine[0]), customerName, currentProcessedLine[2],
                    Double.parseDouble(currentProcessedLine[5]), Double.parseDouble(currentProcessedLine[11]), product, date);

            orders.put(orderToAdd.getOrderNumber(), orderToAdd);

        }
    }

    public void writeOrderBookByDay(LocalDate date) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH + "Orders_" + date.format(DateTimeFormatter.ofPattern("MMddYYYY")) + ".txt"));
        List<Order> ordersToWrite = getOrdersByDate(date);
        for (Order o : ordersToWrite) {
            
            String safeCustomerName=o.getCustomerName().replace(",", "&#44");
            
            
            
            writer.println(o.getOrderNumber() + DELIMITER + safeCustomerName + DELIMITER + o.getState() + DELIMITER + 0.0 + DELIMITER + (o.getProduct()).getProductType()
                    + DELIMITER + o.getArea() + DELIMITER + o.getProduct().getCostPerSquareFoot() + DELIMITER + o.getProduct().getLaborCostPerSquareFoot() + DELIMITER
                    + (o.getProduct().getCostPerSquareFoot() * o.getArea()) + DELIMITER + (o.getProduct().getLaborCostPerSquareFoot() * o.getArea()) + DELIMITER
                    + 0.0 + DELIMITER + o.getTotal());

            writer.flush();
        }

        writer.close();

    }

    public void save() throws IOException {
        
        if (isTesting)
            return;
        for (LocalDate date : datesLoaded) {
            writeOrderBookByDay(date);
        }

        PrintWriter writer = new PrintWriter(new FileWriter(CONFIG_FILE));
        writer.println(idCounter);
        writer.println(isTesting);
        writer.flush();
        writer.close();
        datesLoaded.clear();
        ordersAdded.clear();
        ordersRemoved.clear();
        ordersEdited.clear();

    }

    public String removeOrder (LocalDate date, int orderNumber) throws FileNotFoundException {
        
        loadDateFile(date);

        Order orderToRemove = orders.get(orderNumber);
        if (orderToRemove != null) {
            ordersRemoved.add(orderToRemove);
            orders.remove(orderNumber);

            return "Order removed.";
        } else {
            return "No order found with that order number.";
        }

    }
    
    

    public String loadDateFile(LocalDate date) throws FileNotFoundException {
        File f = new File(FILE_PATH + "Orders_" + date.format(DateTimeFormatter.ofPattern("MMddYYYY")) + ".txt");

        if (!f.exists()) {
            return "There are no orders on this date.";
        }

        if (!datesLoaded.contains(date)) {
            loadOrderBook(date);
            datesLoaded.add(date);
        }
        
        return "";
    }
    
    public Order getOrderByNumber(int i){
        return orders.get(i);
    }
    
    public void putOrderWithId(Order o){
        orders.put(o.getOrderNumber(), o);
    }
    
    public Collection<Order> getAllOrders(){
        return orders.values();
    }


    }


