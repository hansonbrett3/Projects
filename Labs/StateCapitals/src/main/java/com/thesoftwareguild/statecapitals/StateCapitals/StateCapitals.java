import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class StateCapitals {
    public static void main(String[] args) throws Exception {
        Map<String, String> states = new HashMap<String, String>();

        String csvFile = "state-capitals.csv";
    
        Scanner sc = new Scanner(new BufferedReader(new FileReader(csvFile)));
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] row = currentLine.split(",");
            states.put(row[1], row[4]);
        }

        Set<String> stateNames = states.keySet(); 
        System.out.println("");
        System.out.println("STATES:");
        System.out.println("=======");
        for (String k : stateNames) {
            System.out.println(k);
        }

        System.out.println("");
        System.out.println("CAPITALS:");
        System.out.println("=========");
        for (String k : stateNames) {
            System.out.println(states.get(k));
        }

        System.out.println("");
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("====================");
        for (String k : stateNames) {
            System.out.print(k);
            System.out.print(" - ");
            System.out.println(states.get(k));
        }
    }
}
