// UC17: Sort Bogie Names Using Arrays.sort()

import java.util.Arrays;
import java.util.Scanner;

public class UseCase17TrainConsistMgmnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of bogies: ");
        int numBogies = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] bogieNames = new String[numBogies];
        for (int i = 0; i < numBogies; i++) {
            System.out.print("Enter name of bogie " + (i + 1) + ": ");
            bogieNames[i] = scanner.nextLine();
        }

        // Sort the bogie names
        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}