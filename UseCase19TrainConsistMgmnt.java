// UC19: Binary Search for Bogie ID (Optimized Searching)

import java.util.Arrays;
public class UseCase19TrainConsistMgmnt
{
    public static void main(String[] args)
    {
        String[] bogieIDs = {"B001", "B002", "B003", "B004", "B005"};
        String searchID = "B003";
        Arrays.sort(bogieIDs); // Ensure the array is sorted for binary search
        
        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIDs));

        int index = Arrays.binarySearch(bogieIDs, searchID);
        if (index >= 0) 
        {
            System.out.println("Bogie ID " + searchID + " found at index: " + index);
        } 
        else 
        {
            System.out.println("Bogie ID " + searchID + " not found.");
        }
    }
}