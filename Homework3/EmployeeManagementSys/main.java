package Homework3.EmployeeManagementSys;

import java.util.InputMismatchException;
import java.util.Scanner;







public class main {
    //method for undoing changes to salary
public static void undoSalary(Employee alice, Employee copy, String undo){
    switch(undo){
        case "yes":
        case "YES":
        case "y":
        case "Y":
            alice.setSalary(copy.getSalary());
            System.out.print("Undoing changes...\n Final Employee Rcord\n" + alice);
            break;
        case "no":
        case "NO":
        case "n":
        case "N":
            System.out.print("Final Employee Rcord\n" + alice);
    
        default:
            System.out.println("You must enter either yes/no");
    
        }//end of switch
}

public static void undoAddress(Employee alice, Employee copy, String undo){
    switch(undo){
        case "yes":
        case "YES":
        case "y":
        case "Y":
            alice.setAddress(copy.getAddress());
            System.out.print("Undoing changes...\n Final Employee Record\n" + alice);
            break;
        case "no":
        case "NO":
        case "n":
        case "N":
            System.out.print("Final Employee Rcord\n" + alice);
    
        default:
            System.out.println("You must enter either yes/no");
    
        }//end of switch
}










    public static void main(String[] args) {
        //Attributes for employee object to be created
        String id = "E123";
        String name = "Alice";
        String designation = "Software Engineer";
        double salary = 85000.0;
        Address add = new Address("123 Main Str", "New York", "NY", "10001");

        //Employee object
        Employee alice = new Employee(id, name, designation, salary, add);

        System.out.print("Current Employee Record\n" + alice + "\n");
        System.out.print("Which field would you like to update? \n1. Salary \n2. Address \n3. Both \nEnter your choice 1/2/3");
        Scanner input = new Scanner(System.in);
        
        
        try{
            int update = input.nextInt();
            
            switch(update){
                case 1:
                    System.out.print("Enter the new salary: \n");
                    double newSalary = input.nextDouble();

                    //create a deep copy of the alice employee obj
                    Employee salCopy = new Employee(alice.getId(), alice.getName(), alice.getDesignation(), alice.getSalary(), alice.getAddress());

                    alice.setSalary(newSalary);
                    System.out.print("Updated Employee Record\n" + alice + "\nDo you want to undo? (yes/no)\n");

                    String salUndo = input.nextLine();
                    undoSalary(alice, salCopy, salUndo);
                    break;
                
                case 2:
                    System.out.println("Enter new street: ");
                    String newStreet = input.nextLine();

                    System.out.println("Enter new city: ");
                    String newCity = input.nextLine();

                    System.out.println("Enter new state: ");
                    String newState = input.nextLine();

                    System.out.println("Enter new zip: ");
                    String newZip = input.nextLine();

                    //deep copy of the original alice obj
                    Employee addCopy = new Employee(alice.getId(), alice.getName(), alice.getDesignation(), alice.getSalary(), alice.getAddress());
                    alice.setAddress(new Address(newStreet, newCity, newState, newZip));//changes the alice obj


                    System.out.print("Updated Employee Record\n" + alice + "\nDo you want to undo? (yes/no)\n");
                    String addUndo = input.nextLine();
                    undoAddress(alice, addCopy, addUndo);


                    case 3: 
                        System.out.print("Enter the new salary: \n");
                        double salary3 = input.nextDouble();

                        System.out.println("Enter new street: ");
                        String newStreet3 = input.nextLine();

                        System.out.println("Enter new city: ");
                        String newCity3 = input.nextLine();

                        System.out.println("Enter new state: ");
                        String newState3 = input.nextLine();

                        System.out.println("Enter new zip: ");
                        String newZip3 = input.nextLine();


                        //alice deep copy
                        Employee newAlice = new Employee(alice.getId(), alice.getName(), alice.getDesignation(), alice.getSalary(), alice.getAddress());


                        alice.setSalary(salary3);
                        alice.setAddress(new Address(newStreet3, newCity3, newState3, newZip3));

                         System.out.print("Updated Employee Record\n" + alice + "\nDo you want to undo? (yes/no)\n");

                         String undo3 = input.nextLine();
                         if(undo3 == "no"){
                            System.out.print("Final Employee Record\n" + alice);
                         }else{
                            undoAddress(newAlice, newAlice, undo3);
                            undoSalary(newAlice, newAlice, undo3);
                         }

            }
        
        
        
        
        }catch(InputMismatchException e){
            System.out.println("Input error occured");
        }
        
    }
}
