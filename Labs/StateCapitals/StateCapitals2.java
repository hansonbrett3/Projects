import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class StateCapitals2 {
    public static void main(String[] args) {
        Map<String, Capital> states = new HashMap<String, Capital>();
        states = loadCapitalCSV("state-capitals.csv");
            
        printStateCapitals(states);

        System.out.println("\n\n\n");
        int popLimit = getInteger("Please enter the lower limit for capital city population: ");
        Map<String, Capital> filteredStates = filterStateCapitals(states,popLimit);
        System.out.println("");
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + popLimit);
        printStateCapitals(filteredStates);

    }

    public static Map<String, Capital> loadCapitalCSV(String fileName) {
        Map<String, Capital> states = new HashMap<String, Capital>();
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (sc.hasNextLine()) {
                String currentLine = sc.nextLine();
                String[] row = currentLine.split(",");
                String state = row[1];
                String name = row[4];
                int population = Integer.parseInt(row[8]);
                double squareMileage = Double.parseDouble(row[6]);
                Capital capital = new Capital(name, population, squareMileage);
                states.put(state, capital);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return states;
    }


    public static void printStateCapitals(Map<String, Capital> states) {
        Set<String> stateNames = states.keySet(); 
        System.out.println("");
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for (String k : stateNames) {
            System.out.print(k);
            System.out.print(" - ");
            Capital capital = states.get(k);
            System.out.print(capital.getName());
            System.out.print(" | Pop: ");
            System.out.print(capital.getPopulation());
            System.out.print(" | Area: ");
            System.out.print(capital.getSquareMileage());
            System.out.print(" sq mi ");
            System.out.println("");
        }
    }

    public static int getInteger(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }


    public static Map<String, Capital> filterStateCapitals(Map<String, Capital> states, int n) {
        Map<String, Capital> filteredStates = new HashMap<String, Capital>();
        Set<String> stateNames = states.keySet(); 
        for (String k : stateNames) {
            Capital capital = states.get(k);
            if (capital.getPopulation() >= n)
                filteredStates.put(k, capital);
        }
        return filteredStates;
    }


}











