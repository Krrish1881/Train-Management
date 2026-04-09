// UC13: Performance Comparison (Loops vs Streams)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class UseCase13TrainConsistMgmnt {
    static class Bogie {
        private String type;
        private int capacity;
        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            bogies.add(new Bogie("Type" + (i % 5), 100 + (i % 50)));
        }

        // Performance comparison using traditional loops
        long startTime = System.nanoTime();
        int totalCapacityLoop = 0;
        for (Bogie bogie : bogies) {
            totalCapacityLoop += bogie.capacity;
        }
        long endTime = System.nanoTime();
        System.out.println("Total Capacity (Loop): " + totalCapacityLoop);
        System.out.println("Time taken (Loop): " + (endTime - startTime) + " ns");

        // Performance comparison using streams
        startTime = System.nanoTime();
        int totalCapacityStream = bogies.stream().mapToInt(b -> b.capacity).sum();
        endTime = System.nanoTime();
        System.out.println("Total Capacity (Stream): " + totalCapacityStream);
        System.out.println("Time taken (Stream): " + (endTime - startTime) + " ns");
    }
}