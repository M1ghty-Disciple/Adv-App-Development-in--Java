package Serialization;

import java.io.Serializable;

class UserProfile implements Serializable {
    // attributes
    public String username;
    public int age;
    public transient String sessionToken;
    public static String appVersion = "1.0";

    public UserProfile(String username, int age, String sessionToken) {
        this.username = username;
        this.age = age;
        this.sessionToken = sessionToken;
    }

    @Override
    public String toString() {
        return String.format("UserProfile: username=%s, age=%d, sessionToken=%s, appVersion=%s", username, age,
                sessionToken, appVersion);
    }

}