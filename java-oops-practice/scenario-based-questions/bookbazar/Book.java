public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // Encapsulation: stock updated only via method
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
