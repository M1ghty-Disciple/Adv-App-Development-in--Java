abstract class LibraryItem {

    // attributes
    protected String itemId;
    protected String title;
    protected double borrowPricePerDay;

    // constructor
    public LibraryItem(String itemId, String title, double borrowPricePerDay) {
        this.itemId = itemId;
        this.title = title;
        this.borrowPricePerDay = borrowPricePerDay;
    }

    // to be later implemented by subclasses
    public abstract void displayDetails();
}