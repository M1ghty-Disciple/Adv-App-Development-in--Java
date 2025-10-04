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

    // getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s\n", street, city, state, zip);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)// if they are the same obj will return true
            return true;

        if (!(o instanceof Address)) {// returns false if the object is not type resume
            return false;
        }

        Address c = (Address) o; // Typecast object to resume

        return (this.street.equals(c.getStreet()) && (this.city.equals(c.getCity()))
                && (this.state.equals(c.getState())) && (this.zip.equals(c.getZip())));

    }
}
