/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thesoftwareguild.lambdaexamples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;


/**
 *
 * @author apprentice
 */

public class ServerInventoryMapLambdaExample {
    public static void main(String[] args) {
         HashMap<String, Server> serverMap = new HashMap<>();

        Server one = new Server();
        one.setName("web01");
        one.setIp("192.168.1.1");
        one.setMake("Dell");
        one.setRam("8GB");
        one.setNumProcessors("9");
        one.setPurchaseDate(LocalDate.parse("2010-01-01", DateTimeFormatter.ISO_DATE));

        serverMap.put(one.getName(),one);

        one = new Server();
        one.setName("db01");
        one.setIp("192.168.3.45");
        one.setMake("HP");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));

         serverMap.put(one.getName(),one);

        one = new Server();
        one.setName("hr124");
        one.setIp("192.168.32.111");
        one.setMake("IBM");
        one.setRam("16GB");
        one.setNumProcessors("24");
        one.setPurchaseDate(LocalDate.parse("2014-01-01", DateTimeFormatter.ISO_DATE));

        serverMap.put(one.getName(),one);

        one = new Server();
        one.setName("eng16");
        one.setIp("192.168.32.56");
        one.setMake("HP");
        one.setRam("4GB");
        one.setNumProcessors("8");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));

    serverMap.put(one.getName(),one);

        one = new Server();
        one.setName("eng64");
        one.setIp("192.168.34.56");
        one.setMake("HP");
        one.setRam("8GB");
        one.setNumProcessors("16");
        one.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));

         serverMap.put(one.getName(),one);
         
         String make = "dELL";
         
         serverMap.values()
                 .stream()
                 .filter(s->s.getName().equalsIgnoreCase(make))
                 .forEach(e->System.out.println(e.getName()));
         
         System.out.println("find all HP servers that are new==========================");
         
         serverMap.values()
                 .stream()
                 .filter(s->s.getMake().equalsIgnoreCase("HP"))
                 .filter(s->s.getServerAge()<6)
                 .forEach(srv->System.out.println("Server named " + srv.getName() + " is " + srv.getServerAge() + " years old"));
         
         int testAge = 3;
         System.out.println("All servers older then " + testAge);
         
         serverMap.values()
                 .stream()
                 .filter(s->s.getServerAge()>testAge)
                 .forEach(e -> System.out.println(e.getName()));
               
                 
                 System.out.println("get list of servers older than " + testAge);
                 
                 Collection<Server> oldServers = 
                         serverMap.values()
                         .stream()
                         .filter(s->s.getServerAge() > testAge)
                         .collect(Collectors.toList());
                 
                 System.out.println("Number of old servers found: " + oldServers.size());
                 
                 oldServers.forEach(srv -> System.out.println(srv.getName()));
                 
                 double averageAge = serverMap.values()
                         .stream()
                         .mapToLong(Server::getServerAge)
                         .average()
                         .getAsDouble();
                 
                 System.out.println("Average age of servers is " + averageAge + " years.");
                 
                 
    }
}
