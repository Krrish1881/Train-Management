// UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)

import java.util.*;

public class UseCase4TrainConsistMgmnt {
    public static void main(String[] args) {
        // Create a LinkedList to represent the train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies to the consist
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert a Pantry Car at position 2 (index 1)
        trainConsist.add(1, "Pantry Car");

        // Remove the first and last bogie
        trainConsist.removeFirst(); // Removes "Engine"
        trainConsist.removeLast();  // Removes "Guard"

        // Display the final ordered train consist
        System.out.println("Final Train Consist: " + trainConsist);
    }
}