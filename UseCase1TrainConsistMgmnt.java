// UC1: Initialize Train and Display Consist Summary

import java.util.*;

public class UseCase1TrainConsistMgmnt
{
    public static void main(String[] args)
    {
        System.out.println("====================================================");
        System.out.println("   ===  Train Consist Management ===   ");
        System.out.println("====================================================");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Initializing Train Consist...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);

        System.out.println("System ready for operations...");
    }
}