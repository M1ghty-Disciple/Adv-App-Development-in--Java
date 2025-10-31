import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inFileName = input.nextLine();

        System.out.print("\nEnter output file name: ");
        String outFileName = input.nextLine();

        File iFile = new File(inFileName);
        File oFile = new File(outFileName);

        if (iFile.exists()) {
            System.out.print("\nFile exists: " + iFile.exists() + "\nAbsolute Path: " + iFile.getAbsolutePath()
                    + "\nFile Size: " + iFile.length() + " bytes");
        } else
            System.out.print("\nFile does not exsit");

        BufferedReader in = new BufferedReader(new FileReader(iFile));

    }
}
