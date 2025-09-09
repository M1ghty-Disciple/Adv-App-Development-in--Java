package Homework1.TemperatureAnalysis;

import java.util.Scanner;

public class main {


    //Finds the highest temperature
    public static void max(int[] temp) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
                index = i+1;
            } else
                continue;
        }

        System.out.println("Highest Temperature: " + max + " (Day " + index + ")");

    }
    //Finds the Lowest Temperature
    public static void min(int[] temp){
        int min = 1000; 
        int index = 0; 

        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
                index = i+1;
            } else
                continue;
        }

        System.out.println("Lowest Temperature: " + min + " (Day " + index + ")");
    }

    //Finds the Average of all temperatures
    public static void avg(int[] temp){
        double sum = 0.0;

        for(int i = 0; i < temp.length; i++){
            sum += temp[i];
        }
        double avg = sum/temp.length;
        System.out.println("Average Temperature: " + avg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of days
        System.out.println("Enter the number of days (N): ");
        int num = input.nextInt();

        // Create array based on number of days
        int[] temp = new int[num];

        // Fill the array
        System.out.println("Enter " + num + " temperature values (one per line): ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = input.nextInt();
        }

        max(temp);
        min(temp);
        avg(temp);
    }
}
