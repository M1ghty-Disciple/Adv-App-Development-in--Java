package Homework1.TemperatureAnalysis;

import java.util.Scanner;

public class main {

    public static void max(int[] temp) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
                index = i;
            } else
                continue;
        }

        System.out.println("Highest Temperature: " + max + " (Day " + index + ")");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of days
        System.out.println("Enter the number of days (N): ");
        int num = input.nextInt();

        // Create array based on numnber of days
        int[] temp = new int[num];

        // Fill the array
        System.out.println("Enter " + num + " temperature values (one per line): ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = input.nextInt();
        }

        max(temp);
    }
}
