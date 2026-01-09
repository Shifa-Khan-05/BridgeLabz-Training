/*
 * Artwork is the parent class
 * Implements IPurchasable interface
 */
class Artwork implements IPurchasable {

    // Protected variables (Encapsulation)
    protected String title;
    protected String artist;
    protected String licenseType;
    protected double price;

    // Constructor to initialize artwork details
    Artwork(String title, String artist, String licenseType, double price) {
        this.title = title;
        this.artist = artist;
        this.licenseType = licenseType;
        this.price = price;
    }

    // Purchase method deducts wallet balance
    @Override
    public void purchase(User user) {
        if (user.getBalance() >= price) {
            user.deductBalance(price); // operator usage
            System.out.println("Artwork purchased successfully!");
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }

    // Default license behavior (Polymorphism)
    @Override
    public void license() {
        System.out.println("Standard License Applied: " + licenseType);
    }
}
