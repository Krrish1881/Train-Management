// UC9: Group Bogies by Type (Collectors.groupingBy)
import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsostMgmnt
{
    class Bogie
    {
        String type;
        int capacity;

        public Bogie(String type, int capacity)
        {
            this.type = type;
            this.capacity = capacity;
        }

        public String getType()
        {
            return type;
        }

        @Override
        public String toString()
        {
            return "Bogie{" +
                    "type='" + type + '\'' +
                    ", capacity=" + capacity +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        List<Bogie> bogies = Arrays.asList(
                new UseCase9TrainConsostMgmnt().new Bogie("Sleeper", 72),
                new UseCase9TrainConsostMgmnt().new Bogie("AC", 54),
                new UseCase9TrainConsostMgmnt().new Bogie("Sleeper", 72),
                new UseCase9TrainConsostMgmnt().new Bogie("General", 90),
                new UseCase9TrainConsostMgmnt().new Bogie("AC", 54)
        );

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        Map<String, List<Bogie>> bogiesByType = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies by Type:");
        for(Map.Entry<String, List<Bogie>> entry : bogiesByType.entrySet())
        {
            System.out.println("Type: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }
    }
}