/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.controller;

import com.thesoftwareguild.flooringmastery.dao.OrderBook;
import static com.thesoftwareguild.flooringmastery.dao.OrderBook.FILE_PATH;
import com.thesoftwareguild.flooringmastery.dao.ProductInfo;
import com.thesoftwareguild.flooringmastery.dao.TaxInfo;
import com.thesoftwareguild.flooringmastery.dto.Order;
import com.thesoftwareguild.flooringmastery.factory.OrderMaker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class FlooringController {

    private ConsoleIO con;
    private SimpleDateFormat formatter;
    private OrderBook orderBook;
    private OrderMaker orderMaker;
    private TaxInfo taxInfo;
    private ProductInfo productInfo;

    public FlooringController() throws FileNotFoundException {
        con = new ConsoleIO();
        orderBook = new OrderBook();
        orderMaker = new OrderMaker();
        taxInfo = new TaxInfo();
        productInfo = new ProductInfo();
    }

    public void run() throws Exception {

        int userChoice;
        boolean keepGoing = true;

        con.print("Welcome to FlooringMaster!\n\n");

        while (keepGoing) {
            userChoice = menu();
            switch (userChoice) {
                case 1:

                    con.print("Displaying orders...\n\n");

                    displayOrders();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                    editOrder();
                    break;
                case 4:
                    removeOrder();
                    break;
                case 5:
                    save();
                    break;
                case 6:
                    save();
                    keepGoing = false;
                    break;
                default:
                    con.print("Please enter a valid option.");

            }

        }

        con.print("Thank you for using FlooringMaster.");

    }

    private int menu() throws Exception {
        con.print("");
        con.print("*******************************************************************");
        con.print("");
        con.print("*                        Flooring Master Main Menu                 ");
        con.print("");
        con.print("*");
        con.print("");
        con.print("* 1.\tDisplay orders for a certain date");
        con.print("");
        con.print("* 2.\tAdd an order");
        con.print("");
        con.print("* 3.\tEdit an order");
        con.print("");
        con.print("* 4.\tRemove an order");
        con.print("");
        con.print("* 5.\tView and save changes");
        con.print("");
        con.print("* 6.\t Exit");
        con.print("");
        con.print("*");
        con.print("");
        con.print("*******************************************************************");

        return con.getInteger("Please select an option: ", 1, 6);
    }

    private void addOrder() throws Exception {
        con.print("Adding an order...\n\n");

        LocalDate date = con.getADate("Please enter a date for this order (mm/dd/yyyy): ");
        Order toAdd = orderMaker.makeOrder(con.getString("Please enter the name of the customer: "),
                getState(),
                con.getDouble("Please enter the area of the order: "),
                getProduct(),
                date);

        con.print("Is this information correct?");
        con.print(toAdd.toStringWithoutOrderNumber() + "\n\n");
        int userChoice = con.getInteger("1. Yes\n2. No", 1, 2);

        if (userChoice == 1) {
            orderBook.addOrder(toAdd);
            con.print("Order added.");
        } else {
            con.print("Canceled adding order.");
        }
        con.getString("Press ENTER to continue.");

    }

    private void displayOrders() throws Exception {

        List<Order> output = orderBook.getOrdersByDate(con.getADate("Please enter the date of the orders (mm/dd/yyyy): "));
        for (Order o : output) {
            con.print(o.toString());
        }
        con.getString("Please press ENTER to continue.");

    }

    private void removeOrder() throws Exception {

        con.print("Removing an order...\n\n");

       LocalDate date =  con.getADate("Please enter the date for the order you wish to remove (mm/dd/yyyy): ");
       List<Order> output = orderBook.getOrdersByDate(date);
        for (Order o : output) {
            con.print(o.toString());
        }
        int orderNumber = con.getInteger("Please enter the order number of the order you wish to remove: ", 1, Integer.MAX_VALUE);
       
        con.print(orderBook.removeOrder(date, orderNumber));

    }

    private void save() throws IOException, Exception {
        con.print("Here are the oustanding changes to be saved (A - added, E - edited, R - removed):");
        for(Order o: orderBook.ordersAdded){
            con.print("A "+o.toString());
        }
        
        for(Order o: orderBook.ordersEdited){
            con.print("E "+o.toString());
        }
        
        for (Order o: orderBook.ordersRemoved){
            con.print("R "+o.toString());
        }

        con.print("(1)\t Save");
        con.print("(2)\t Continue without saving");

        int saving = con.getInteger("Please select an option: ", 1, 2);

        if (saving == 1) {
            orderBook.save();
            con.print("Changes saved.");
        } else {
            con.print("No changes saved.");
        }
        con.getString("Please press ENTER to continue.");

    }

    private void editOrder() throws Exception {

        con.print("Editing order...\n\n");

        displayOrders();

        int orderNumber = con.getInteger("Please enter the order number of the order you wish to edit: ", 1, Integer.MAX_VALUE);
        Order toEdit = orderBook.getOrderByNumber(orderNumber);
        if (toEdit == null) {
            con.print("There is no order with this order number.");
        } else {

            orderBook.getDatesLoaded().add(toEdit.getDate());
            String newCustomerName = con.getString("Enter customer name (" + toEdit.getCustomerName() + "): ");
            if (newCustomerName.equals("")) {
                newCustomerName = toEdit.getCustomerName();
            }

            con.print("States:");
            for (String s : taxInfo.getKeySet()) {
                con.print(s);
            }

            String newState = con.getString("Enter state (" + toEdit.getState() + "): ");
            while (true) {
                if (newState.equals("")) {
                    newState = toEdit.getState();
                    break;
                } else if (taxInfo.getTaxByState(newState) == null) {
                    newState = con.getString("Please enter a valid choice from the list, or press ENTER to keep previous state: ");
                } else {
                    break;
                }

            }

            String newArea = con.getString("Enter area (" + toEdit.getArea() + "): ");
            if (newArea.equals("")) {
                newArea = "" + toEdit.getArea();
            }

            con.print("Products:");
            for (String s : productInfo.getKeySet()) {
                con.print(s);
            }

            String newProduct = con.getString("Enter product type (" + toEdit.getProduct().getProductType() + "): ");
            while (true) {
                if (newProduct.equals("")) {
                    newProduct = toEdit.getProduct().getProductType();
                    break;
                } else if (productInfo.getProductByName(newProduct) == null) {
                    newProduct = con.getString("Please enter a valid choice from the list, or press ENTER to keep previous product: ");
                } else {
                    break;
                }

            }

            LocalDate actualDate;

            String newDate = con.getString("Please enter the date (" + toEdit.getDate().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "): ");
            if (newDate.equals("")) {
                actualDate = toEdit.getDate();

            } else {
                while (true) {
                    try {
                        actualDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        newDate = con.getString("Please enter a date in the valid format (mm/dd/yyyy): ");
                    }
                }

                File f = new File(FILE_PATH + "Orders_" + actualDate.format(DateTimeFormatter.ofPattern("MMddYYYY")) + ".txt");

                if (f.exists() && !orderBook.getDatesLoaded().contains(actualDate)) {
                    orderBook.loadOrderBook(actualDate);
                }
                orderBook.getDatesLoaded().add(actualDate);

            }

            Order toAdd = orderMaker.makeOrderWithID(toEdit.getOrderNumber(), newCustomerName, newState, Double.parseDouble(newArea), newProduct, actualDate);

            con.print("Do you want to save these changes?");
            con.print(toAdd.toString());
            con.print("(1) Yes");
            con.print("(2) No");
            int userChoice = con.getInteger("", 1, 2);

            if (userChoice == 1) {
                orderBook.putOrderWithId(toAdd);
                orderBook.ordersEdited.add(toAdd);
                con.print("Saved edits.");
            } else {
                con.print("Edits not saved.");
            }

            con.getString("Press ENTER to continue.");

        }
    }

    private String getState() {
        con.print("States:");
        for (String s : taxInfo.getKeySet()) {
            con.print(s);
        }

        String userChoice = con.getString("Please select from the list above: ");

        while (true) {
            if (taxInfo.getTaxByState(userChoice) == null) {
                userChoice = con.getString("Please enter a valid choice from the list: ");
            } else {
                break;
            }
        }

        return userChoice;
    }

    private String getProduct() {
        con.print("Products:");
        for (String s : productInfo.getKeySet()) {
            con.print(s);
        }

        String userChoice = con.getString("Please select from the list above: ");

        while (true) {
            if (productInfo.getProductByName(userChoice) == null) {
                userChoice = con.getString("Please enter a valid choice from the list: ");
            } else {
                break;
            }
        }

        return userChoice;
    }
}
