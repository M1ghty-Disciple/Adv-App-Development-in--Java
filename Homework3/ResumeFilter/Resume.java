package Homework3.ResumeFilter;

import java.util.ArrayList;

public class Resume {
    // attributes
    private String candidateName;
    private int yearsOfExpirience;
    private Address add;
    private ArrayList<String> skills = new ArrayList<String>();

    public Resume(String candidateName, int yearsOfExpirience, Address add, ArrayList<String> skills) {
        this.candidateName = candidateName;
        this.yearsOfExpirience = yearsOfExpirience;
        this.add = add;
        this.skills = skills;
    }

    // getters
    public int getYearsOfExpirirence() {
        return yearsOfExpirience;
    }

    public Address getAddress() {
        return add;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\nExpirience: %d years\nSkills: %s\nAddress: %s\n", candidateName,
                yearsOfExpirience, skills, add);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)// if they are the same obj will return true
            return true;

        if (!(o instanceof Resume)) {// returns false if the object is not type resume
            return false;
        }

        Resume c = (Resume) o; // Typecast object to resume

        return ((this.yearsOfExpirience == c.getYearsOfExpirirence())
                && (this.add.equals(c.getAddress()) && this.skills.equals(c.getSkills())));

    }

}
