package Serialization;

public class ProfileManager {

    String username = "Randy";
    int age = 23;
    String sessionToken = "ABCD1234";

    public UserProfile profile() {
        return new UserProfile(username, age, sessionToken);
    }

}
