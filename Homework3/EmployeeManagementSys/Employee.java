package Homework3.EmployeeManagementSys;

public class Employee {
    // attributes
    private String id;
    private String name;
    private String designation;
    private double salary;
    private Address address;

    // constructor
    public Employee(String id, String name, String designation, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    // setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // getters
    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address.display();
    }

}
