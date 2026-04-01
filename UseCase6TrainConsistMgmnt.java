// UC6: Map Bogie to Capacity (HashMap)

import java.util.*;

public class UseCase6TrainConsistMgmnt {
    public static void main(String[] args) {
        // Create a HashMap to store bogie-capacity information
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert capacity values for bogies
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // Iterate over the map using entrySet() and display each bogie with its capacity
        System.out.println("Bogie Capacity Information:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println(bogieName + ": " + capacity + " seats");
        }
    }
}