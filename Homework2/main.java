import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void menu() {
        System.out.println("\n==== Library Menu ==== ");
        System.out.println("1 - View Available Items \n2 - Borrow an Item\n3 - Exit");
        System.out.println("Choose an option 1-3");
    }

    public static void showItems(LibraryItem[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null)
                continue;
            else
                items[i].displayDetails();
        }
    }

    public static void main(String[] args) {
        // Storing all the objects in the library
        LibraryItem[] availableItems = new LibraryItem[5];
        availableItems[0] = new Book("B101", "Clean Code", 1.50, "Robert C. Martin", 464);
        availableItems[1] = new Book("B102", "Desing Pattern", 1.75, "GOF", 395);
        availableItems[2] = new Magazine("M201", "NatGeo July 2025", 0.80, "July 2025", "National Geographic");
        availableItems[3] = new DVD("D301", "Interstellar", 2.00, "169 min", "PG-13");
        availableItems[4] = new DVD("D302", "Inception", 2.00, "148 min", "PG-13");

        boolean exit = false;
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (!exit) {
            menu();// shows the menu

            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Improper input");
                break;// I couldn't figure out how to keep the loop running when this error occured
                      // here

            }

            // switch statement to handle different user inputs
            switch (choice) {
                // View Available Items
                case 1:
                    showItems(availableItems);
                    break;

                // Borrow an item
                case 2:
                    input.nextLine(); // Clear the newline character from the stream
                    try {
                        System.out.print("Enter item ID to borrow: ");
                        String id = input.nextLine();

                        System.out.print("Enter the number of days: ");
                        int days = input.nextInt();

                        for (int i = 0; i < availableItems.length; i++) {
                            if (availableItems[i] == null)
                                continue;

                            else if (availableItems[i].getItemId().equalsIgnoreCase(id)) {
                                System.out.printf("You borrowed '%s' for %d days. Total cost is $%.2f\n",
                                        availableItems[i].getTitle(), days,
                                        availableItems[i].calculateBorrowCost(days));

                                availableItems[i] = null;
                                System.out.println("Item is now marked as borrowed and no longer available");
                            }
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("There seems to be an error in your input");
                    }
                    break;

                // Exit
                case 3:
                    System.out.println("Thank you for stopping by");
                    exit = true;
                    break;

                default:
                    System.out.println("You must enter either 1, 2 or 3");
                    break;

            }// End of switch Stmt

        }

    }
}
