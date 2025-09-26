abstract class LibraryItem implements Borrowable{

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

    public String getItemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }

    // to be later implemented by subclasses
    public abstract void displayDetails();

    public abstract double calculateBorrowCost(int days);
}