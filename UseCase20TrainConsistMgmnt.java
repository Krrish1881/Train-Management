// UC20: Exception Handling During Search Operations

public class UseCase20TrainConsistMgmnt
{
    public static void main(String[] args)
    {
        int[] bogieIDs = {101, 102, 103, 104, 105};
        int searchID = 106;
        if(bogieIDs.length == 0) 
        {
            System.out.println("No bogies in the train consist.");
            return;
        }

        boolean found = false;

        for(int id : bogieIDs) 
        {
            if(id == searchID) 
            {
                found = true;
                break;
            }
        }

        if(found) 
        {
            System.out.println("Bogie ID " + searchID + " found.");
        } 
        else 
        {
            System.out.println("Bogie ID " + searchID + " not found.");
        }
    }
}