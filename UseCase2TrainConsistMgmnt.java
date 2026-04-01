// UC2: Add Passenger Bogies to Train (ArrayList Operations)

import java.util.*;

public class UseCase2TrainConsistMgmnt
{
    public static void main(String[] args)
    {
        // Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies to the list
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Print the list after insertion
        System.out.println("Passenger Bogies after insertion: " + passengerBogies);

        // Remove one bogie (for example AC Chair)
        passengerBogies.remove("AC Chair");

        // Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does the train have Sleeper bogie? " + hasSleeper);

        // Print final list state
        System.out.println("Final Passenger Bogies: " + passengerBogies);
    }
}