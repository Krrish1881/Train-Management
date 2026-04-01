// UC3: Track Unique Bogie IDs (Set – HashSet)
/* Key Concepts Used in UC3
HashSet – Stores unique elements.


Set Interface – Collection type that does not allow duplicate elements.


HashSet – Implementation of Set that stores elements using hashing for fast access.


add() Method – Inserts values into the set.


Automatic Deduplication – HashSet ensures uniqueness without manual checks.


Unordered Storage – Elements are not stored using index positions.



Key Requirements

Create a HashSet<String> for bogie IDs.


Add duplicate values intentionally.


Print the final set.


Observe that duplicates are removed automatically.
 */

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