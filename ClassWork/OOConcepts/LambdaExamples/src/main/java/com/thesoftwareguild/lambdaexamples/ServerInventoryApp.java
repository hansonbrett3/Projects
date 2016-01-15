/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.lambdaexamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class ServerInventoryApp {

    public static void main(String[] args) {
        List<Server> servers = new ArrayList<>();

        Server one = new Server();
        one.setName("web01");
        one.setIp("192.168.1.1");
        one.setMake("Dell");
        one.setRam("8GB");
        one.setNumProcessors("9");
        one.setPurchaseDate(LocalDate.parse("2010-01-01", DateTimeFormatter.ISO_DATE));

        servers.add(one);

        one = new Server();
        one.setName("db01");
        one.setIp("192.168.3.45");
        one.setMake("HP");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));

        servers.add(one);

        one = new Server();
        one.setName("hr124");
        one.setIp("192.168.32.111");
        one.setMake("IBM");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2014-01-01", DateTimeFormatter.ISO_DATE));

        servers.add(one);

        one = new Server();
        one.setName("eng16");
        one.setIp("192.168.32.56");
        one.setMake("HP");
        one.setRam("4GB");
        one.setNumProcessors("8");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));

        servers.add(one);

        one = new Server();
        one.setName("eng64");
        one.setIp("192.168.34.56");
        one.setMake("HP");
        one.setRam("8GB");
        one.setNumProcessors("16");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));

        servers.add(one);

        //DEFINE MAKE STRING
        String make = "dELL";

        System.out.println("Find all Dells==============");

        // BECAUSE THERE IS A SERVER STRING......
        servers
                .stream()
                .filter(s -> s.getMake().equalsIgnoreCase(make))
                .forEach(e -> System.out.println(e.getName()));

        servers
                .stream()
                // FOR FILTER METHOD, HAS TO RETURN TRUE OR FALSE (BOOLEAN)
                .filter((Server s) -> {
                    boolean result = s.getMake().equalsIgnoreCase(make);
                    return result;
                })
                .forEach((Server e) -> {
                    System.out.println(e.getName());
                });
        System.out.println("print all old servers===================");
        long testAge = 6;
        servers.stream()
                .filter(s -> s.getServerAge() > testAge)
                .forEach(e -> System.out.println(e.getName()));
        
        System.out.println("pull all old servers into a collection =============");
        
        List<Server> oldServers = 
                (List<Server>) servers.stream()
                .filter(s -> s.getServerAge()>testAge)
                .collect(Collectors.toList());
        
        System.out.println("Number of servers found" + oldServers.size());
        //can use any variable Name
        oldServers.forEach(donkeyLobster -> System.out.println(donkeyLobster.getName()));
        
        double averageAge = servers.stream()
                .mapToLong(Server::getServerAge)
                .average()
                .getAsDouble();
        
        System.out.println("Average age of servers is " + averageAge + " years.");
    }
    
}
