package Homework3.ResumeFilter;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        // create an arraylist of objects
        ArrayList<Resume> candidates = new ArrayList<Resume>();

        candidates.add(new Resume("Alice", 5, new Address("123 Elm St", "New York", "NY", "10001"),
                new ArrayList<String>(Arrays.asList("Java", "Spring", "AWS"))));

        candidates.add(new Resume("Bob", 3, new Address("456 Pine St", "San Francisco", "CA", "94105"),
                new ArrayList<String>(Arrays.asList("Python", "ML", "TensorFlow"))));

        candidates.add(new Resume("Charlie", 5, new Address("123 Elm St", "New York", "NY", "10001"),
                new ArrayList<String>(Arrays.asList("Java", "Spring", "AWS"))));

        candidates.add(new Resume("Eve", 3, new Address("456 Pine St", "San Francisco", "CA", "94105"),
                new ArrayList<String>(Arrays.asList("Python", "ML", "TensorFlow"))));

        System.out.print("--- All Received Applications ---\n" + candidates);

        ArrayList<Resume> copy = new ArrayList<Resume>();
        for (int i = 0; i < candidates.size(); i++) {
            for (int j = i + 1; j < candidates.size(); j++) {
                if (candidates.get(i).equals(candidates.get(j))) {
                    copy.add(candidates.get(j));
                    candidates.remove(j);
                }
            } // 2nd for loop
        } // first for loop

        System.out.print("--- Duplicate Applications Found ---\n" + copy);
        System.out.print("--- Final Unique Applications ---\n" + candidates);
    }// End of main
}// End of Class
