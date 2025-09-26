public class Book extends LibraryItem{

    // attributes
    protected String author;
    protected int numPages;

    // constructor
    public Book(String itemId, String title, double borrowPricePerDay, String author, int numPages) {
        super(itemId, title, borrowPricePerDay);
        this.author = author;
        this.numPages = numPages;
    }

    

    @Override
    public void displayDetails() {
        System.out.println("[Book] ID=" + itemId + " | Title=" + title + " | Auther=" + author
                + " | Pages=" + numPages + " | $/day=" + borrowPricePerDay);
    }

    @Override
    public double calculateBorrowCost(int days) {
        return borrowPricePerDay * days;
    }

}
