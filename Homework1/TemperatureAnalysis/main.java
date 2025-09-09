package Homework1.TemperatureAnalysis;

import java.util.Scanner;

public class main {

    // Finds the highest temperature
    public static void max(int[] temp) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
                index = i + 1;
            } else
                continue;
        }

        System.out.println("Highest Temperature: " + max + " (Day " + index + ")");

    }

    // Finds the Lowest Temperature
    public static void min(int[] temp) {
        int min = 1000;
        int index = 0;

        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
                index = i + 1;
            } else
                continue;
        }

        System.out.println("Lowest Temperature: " + min + " (Day " + index + ")");
    }

    // Finds the Average of all temperatures
    public static void avg(int[] temp) {
        double sum = 0.0;

        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
        }
        double avg = sum / temp.length;
        System.out.println("Average Temperature: " + avg);
    }

    /*
     * streak function
     * public static void streak(int temp[]) {
     * int streak = 0;
     * int start = 0;
     * int end = 0;
     * 
     * 
     * for(int i = 0; i < temp.length-1; i++){
     * if(temp[i+1] == temp[i] + 1){
     * streak
     * }
     * }
     * }
     */

    public static String dup(int temp[]) {
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 1; j < temp.length; j++) {

                if (temp[i] == temp[j])// BUG HERE; RETURNING TRUE NO MATTER WHAT
                    return "Any Duplicate temperatures recorded? Yes";
            }
        }
        return "Any Duplicate temperatures recorded? No";
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
        System.out.println(dup(temp));
    }
}
