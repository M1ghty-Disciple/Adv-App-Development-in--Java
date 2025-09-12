package Homework1.SentenceAnalysis;

import java.util.Scanner;

public class main {

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");// Prompts the user for input
        String sentence = input.nextLine();

        System.out.println("=== Sentence Analysis ===");

        // Original Sentence
        System.out.println("Original Sentence: " + sentence);

        // Character count
        System.out.println("Character Count (NO SPACES): " + sentence.replace(" ", "").length());

        // Word Count
        System.out.println("Word Count: " + sentence.split("\\s+").length);
        // Uppercase
        System.out.println("UPPERCASE: " + sentence.toUpperCase());
        // lowercase
        System.out.println("lowercase: " + sentence.toLowerCase());
        // First word & Last word
        String[] words = sentence.split("\\s+");

        System.out.println("First word: " + words[0]);
        System.out.println("Last word: " + words[words.length - 1]);
        // Palindrone
        String newSentence = sentence.replace(" ", "");
        String reverse = reverseString(newSentence);
        if (newSentence.equalsIgnoreCase(reverse))
            System.out.println("Is a Palindrone: Yes");
        else
            System.out.println("Is a Palindrone: No");

        // Sentence Classification
        if (sentence.length() < 21)
            System.out.println("Sentence classification: " + "Short");
        else if (sentence.length() > 20 && sentence.length() < 50)
            System.out.println("Sentence classification: " + "Medium");
        else
            System.out.println("Sentence classification: " + "Long");

        input.close();

    }
}
