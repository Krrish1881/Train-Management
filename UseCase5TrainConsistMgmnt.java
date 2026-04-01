// UC5: Preserve Insertion Order of Bogies (LinkedHashSet)

import java.util.*;

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies to the train
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie (Sleeper again)
        boolean isAdded = trainFormation.add("Sleeper");
        if (!isAdded) {
            System.out.println("Duplicate bogie 'Sleeper' not added to the formation.");
        }

        // Display the final formation order
        System.out.println("Final Train Formation: " + trainFormation);
    }
}