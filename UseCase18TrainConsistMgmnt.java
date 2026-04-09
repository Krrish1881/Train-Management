// UC18: Linear Search for Bogie ID (Array-Based Searching)

public class UseCase18TrainConsistMgmnt
{
    public static void main(String[] args)
    {
        String[] bogieIDs = {"BG101", "BG102", "BG103", "BG104", "BG105"};
        String searchID = "BG103";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // Linear search for the specified bogie ID
        boolean found = false;
        for (String id : bogieIDs) {
            if (id.equals(searchID)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchID + " found.");
        } else {
            System.out.println("Bogie ID " + searchID + " not found.");
        }
    }
}