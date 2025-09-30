package Homework1.Abbreviations;

import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String phrase = input.nextLine();

        String[] words = phrase.split("\\s+");
        StringBuilder abb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            if (Character.isUpperCase(first))
                abb.append(first);
        }

        System.out.println("Generated Abrreviation: " + abb);
        input.close();
    }
}