public class Magazine extends LibraryItem implements Borrowable {

    // attributes
    protected String issue;
    protected String publisher;

    // constructor
    public Magazine(String itemId, String title, double borrowPricePerDay, String issue, String publisher) {
        super(itemId, title, borrowPricePerDay);
        this.issue = issue;
        this.publisher = publisher;
    }

    // abstract method implementation
    @Override
    public void displayDetails() {
        System.out.println("[Magazine] ID=" + itemId + " | Title=" + title + " | Issue=" + issueNumber
                + " | Publisher=" + publisher + " | $/day=" + borrowPricePerDay);
    }

    @Override
    public double calculateBorrowCost(int days) {
        return borrowPricePerDay * days;
    }
}
