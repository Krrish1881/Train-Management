// UC11: Validate Train ID & Cargo Codes (Regex)

import java.util.*;

public class UseCase11TrainConsistMgmnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Train ID: ");
        String trainID = scanner.nextLine();
        System.out.print("Enter Cargo Codes: ");
        String cargoCodes = scanner.nextLine();
        scanner.close();
        if (trainID.matches("[A-Z]{2}[0-9]{2}") && cargoCodes.matches("[A-Z]{3}")) {
            System.out.println("Train ID and Cargo Codes are valid.");
        } else {
            System.out.println("Train ID or Cargo Codes are invalid.");
        }
    }
}