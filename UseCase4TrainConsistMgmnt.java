// UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
/*  Key Concepts Used in UC4
LinkedList – A doubly linked list implementation of the List interface where elements are connected using node references instead of indexes.


Node Structure Concept – Each element contains data and links to previous and next nodes, enabling efficient insertions and deletions.


addFirst() / addLast() – Methods to attach bogies at the beginning or end of the train.


add(index, element) – Inserts a bogie in the middle of the consist.


removeFirst() / removeLast() – Detaches bogies from the head or tail.


Order Preservation – Maintains the physical sequence of train bogies.
Key Requirements
Create a LinkedList<String> for the consist.


Add bogies: Engine, Sleeper, AC, Cargo, Guard.


Insert a Pantry Car at position 2.


Remove the first and last bogie.


Display the final ordered train consist.
*/

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