// UC14: Handle Invalid Bogie Capacity (Custom Exception)

import java.util.*;

public class UseCase14TrainConsistMgmnt
{
    static class InvalidBogieCapacityException extends Exception
    {
        public InvalidBogieCapacityException(String message)
        {
            super(message);
        }
    }

    static class PassengerBogie
    {
        private int capacity;

        public PassengerBogie(int capacity) throws InvalidBogieCapacityException
        {
            if (capacity <= 0)
            {
                throw new InvalidBogieCapacityException("Bogie capacity must be greater than zero.");
            }
            this.capacity = capacity;
        }

        public int getCapacity()
        {
            return capacity;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<PassengerBogie> bogies = new ArrayList<>();

        System.out.print("Enter the number of bogies: ");
        int numBogies = scanner.nextInt();

        for (int i = 0; i < numBogies; i++)
        {
            System.out.print("Enter capacity for bogie " + (i + 1) + ": ");
            int capacity = scanner.nextInt();
            try
            {
                PassengerBogie bogie = new PassengerBogie(capacity);
                bogies.add(bogie);
                System.out.println("Bogie " + (i + 1) + " added with capacity: " + capacity);
            }
            catch (InvalidBogieCapacityException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Total bogies added: " + bogies.size());
    }
}