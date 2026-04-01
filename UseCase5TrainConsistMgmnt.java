// UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
/* Key Concepts Used in UC5
LinkedHashSet – A hash table and linked list implementation of the Set interface that stores unique elements while maintaining the exact insertion order of bogies in the train formation.
Set Interface – A collection type in Java that does not allow duplicate elements, ensuring that the same bogie cannot be attached more than once in the train consist.
add() Method – Inserts a bogie into the formation. If the bogie already exists, the method ignores the insertion automatically, protecting the train from invalid duplicate attachments.
Automatic Deduplication – LinkedHashSet removes duplicate bogies internally without requiring manual validation logic from the developer.
Insertion Order Preservation – Unlike HashSet, LinkedHashSet maintains the sequence in which bogies are added, allowing the train consist to reflect the real physical attachment order.
Ordered Iteration – When iterating or printing the collection, bogies are returned in the same order they were connected to the engine.
Key Requirements
Create a LinkedHashSet<String> to represent the train formation.
Attach bogies such as: Engine, Sleeper, Cargo, Guard.
Attempt to attach a duplicate bogie intentionally (for example, Sleeper again).
Display the final formation order using System.out.println().
Ensure that duplicates do not appear in the output.
*/

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