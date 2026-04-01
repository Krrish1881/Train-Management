// UC3: Track Unique Bogie IDs (Set – HashSet)

import java.util.*;

public class UseCase3TrainConsistMgmnt {
    public static void main(String[] args) {
        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs, including duplicates
        bogieIDs.add("Bogie1");
        bogieIDs.add("Bogie2");
        bogieIDs.add("Bogie3");
        bogieIDs.add("Bogie1"); // Duplicate
        bogieIDs.add("Bogie4");
        bogieIDs.add("Bogie2"); // Duplicate

        // Print the final set of unique bogie IDs
        System.out.println("Unique Bogie IDs in the Train Consist:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}