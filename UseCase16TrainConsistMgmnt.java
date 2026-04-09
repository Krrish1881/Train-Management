/* UC16 - Sort Passenger Bogies by Capacity
    Sort passenger bogie capacities using a basic algorithm (Bubble Sort) instead of library methods. */

import java.util.Scanner;

public class UseCase16TrainConsistMgmnt
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bogies = new int[n];
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j] > bogies[j + 1]) {
                    int temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(bogies[i] + " ");
        }
        sc.close();
    }
}