package Homework3.ResumeFilter;

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

    //getters
    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getZip(){
        return zip;
    }










    public String display() {
        return String.format("%s, %s, %s, %s", street, city, state, zip);
    }

    //will go through and compare different parts of an address function | return true if they are all the same
    public boolean compareAdd(Address add){
        if(street.equals(add.getStreet()) && city.equals(add.getCity()) && state.equals(add.getState()) && zip.equals(add.getZip()))
            return true;

        return false;
    }
}
