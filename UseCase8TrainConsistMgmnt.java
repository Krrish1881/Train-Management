// UC8: Filter Passenger Bogies Using Streams

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmnt
{
    static class Bogie
    {
        private String name;
        private int capacity;

        Bogie(String name, int capacity)
        {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args)
    {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Passenger Bogie", 100));
        bogies.add(new Bogie("Cargo Bogie", 50));
        bogies.add(new Bogie("Passenger Bogie", 120));
        bogies.add(new Bogie("Cargo Bogie", 60));

        List<Bogie> passengerBogies = bogies.stream()
                .filter(b -> b.name.equals("Passenger Bogie"))
                .collect(Collectors.toList());

        System.out.println("Passenger Bogies:");
        passengerBogies.forEach(b -> System.out.println(b.name + " with capacity " + b.capacity));
    }
}