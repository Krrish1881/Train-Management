// UC10: Count Total Seats in Train (reduce)

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class UseCase10TrainConsistMgmnt 
{
    static class Bogie
    {
        private int seats;

        public Bogie(int seats) {
            this.seats = seats;
        }

        public int getSeats() {
            return seats;
        }
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(50));
        bogies.add(new Bogie(60));
        bogies.add(new Bogie(40));

        int totalSeats = bogies.stream()
                .mapToInt(Bogie::getSeats)
                .sum();

        System.out.println("Total Seats in Train: " + totalSeats);
    }
}