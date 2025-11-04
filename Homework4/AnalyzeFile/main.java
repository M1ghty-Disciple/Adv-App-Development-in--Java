package AnalyzeFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    // returns the number of characters total in a file
    static int charCount(ArrayList<String> lines) {

        int chars = 0;
        for (int i = 0; i < lines.size(); i++) {
            chars += lines.get(i).replaceAll("\\s+", "").length();
        }
        return chars;
    }

    // returns the word count
    static int wordCount(ArrayList<String> lines) {
        int words = 0;
        for (int i = 0; i < lines.size(); i++) {
            words += lines.get(i).split("\\s+").length;
        }
        return words;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inFileName = input.nextLine();

        System.out.print("\nEnter output file name: ");
        String outFileName = input.nextLine();

        // create the file objects for input file and output file
        File iFile = new File(inFileName);
        File oFile = new File(outFileName);

        try {
            System.out.print("\nFile exists: " + iFile.exists() + "\nAbsolute Path: " + iFile.getAbsolutePath()
                    + "\nFile Size: " + iFile.length() + " bytes");

            BufferedReader br = new BufferedReader(new FileReader(iFile));// object to read data from the file

            String line;
            ArrayList<String> lines = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            // SUMMARY//
            int totalLines = lines.size();
            int charCount = charCount(lines);
            int wordCount = wordCount(lines);

            // Write the Summary to the outfile
            BufferedWriter bw = new BufferedWriter(new FileWriter(oFile));
            if (!oFile.exists())
                oFile.createNewFile();// creates file if it doenst exist
            bw.write("SUMMARY \n---------------- \nTotal lines: " + totalLines + "\nTotal Words: " + wordCount
                    + "\nTotal Characters (excluding spaces): " + charCount
                    + "\n---------------- \nFirst non-blank line: " + lines.get(0) + "\nLast non-blank line: "
                    + lines.get(lines.size() - 1));
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
