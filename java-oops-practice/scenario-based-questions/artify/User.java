/*
19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.*/
/*
 * User class represents a buyer
 * walletBalance is private (Encapsulation)
 */
class User {

    protected String userName;
    private double walletBalance;

    // Constructor to initialize user details
    User(String userName, double walletBalance) {
        this.userName = userName;
        this.walletBalance = walletBalance;
    }

    // Getter for wallet balance
    public double getBalance() {
        return walletBalance;
    }

    // Deduct amount after purchase
    public void deductBalance(double amount) {
        walletBalance -= amount;
    }
}
