public class DVD extends LibraryItem {

    // attributes
    protected String duration;
    protected String ageRating;

    // constructor
    public DVD(String itemId, String title, double borrowPricePerDay, String duration, String ageRating) {
        super(itemId, title, borrowPricePerDay);
        this.duration = duration;
        this.ageRating = ageRating;
    }

    @Override
    public void displayDetails() {
        System.out.println("[DVD] ID=" + itemId + " | Title=" + title + " | Duration=" + duration
                + " | Rating=" + ageRating + " | $/day=" + borrowPricePerDay);
    }

    @Override
    public double calculateBorrowCost(int days) {
        return borrowPricePerDay * days;
    }

}
