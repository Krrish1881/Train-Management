// UC7: Sort Bogies by Capacity (Comparator)

import java.util.*;

public class UseCase7TrainConsistMgmnt
{
    static class Bogie
    {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity)
        {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName()
        {
            return name;
        }

        public int getCapacity()
        {
            return capacity;
        }

        @Override
        public String toString()
        {
            return "Bogie{name='" + name + "', capacity=" + capacity + "}";
        }
    }

    public static void main(String[] args)
    {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Bogie1", 50));
        bogies.add(new Bogie("Bogie2", 30));
        bogies.add(new Bogie("Bogie3", 40));

        // Sort bogies by capacity using a Comparator
        Collections.sort(bogies, new Comparator<Bogie>()
        {
            @Override
            public int compare(Bogie b1, Bogie b2)
            {
                return Integer.compare(b1.getCapacity(), b2.getCapacity());
            }
        });

        // Print sorted bogies
        for (Bogie bogie : bogies)
        {
            System.out.println(bogie);
        }
    }
}