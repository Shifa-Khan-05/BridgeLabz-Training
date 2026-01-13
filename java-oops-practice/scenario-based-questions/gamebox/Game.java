// Base Game class
public abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Constructor for paid game
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Constructor for free game
    public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    // Apply seasonal discount using operators
    public void applySeasonalOffer(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
    }
}
