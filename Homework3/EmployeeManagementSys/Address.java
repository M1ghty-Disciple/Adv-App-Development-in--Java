package Homework3.EmployeeManagementSys;

public class Address {

    // attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    // constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String display() {
        return String.format("%s, %s, %s, %s\n", street, city, state, zip);
    }
}
