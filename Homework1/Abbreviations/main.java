package Homework1.Abbreviations;

import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine().toUpperCase();

        String[] words = phrase.split("\\s+");
        StringBuilder abb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            abb.append(words[i].charAt(0));
        }

        System.out.println("Generated Abrreviation: " + abb);
        input.close();
    }
}