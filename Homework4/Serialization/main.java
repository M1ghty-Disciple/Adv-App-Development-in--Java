package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {
        UserProfile profile = new ProfileManager().profile();// profile object

        // Before serialization
        System.out.println("Before Serialization\n" + profile);

        File file = new File("userprofile.dat");

        try {
            // serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(profile);// writes object data to a file
            System.out.println("Saved to " + file.getAbsolutePath());

            // deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            UserProfile serProfile = (UserProfile) ois.readObject();

            System.out.println("After Serialization\n" + serProfile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
