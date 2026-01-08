import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity; // hidden stock

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); // default quantity
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated stock update
    protected boolean reduceStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }

    // Sensitive pricing logic hidden
    private double applyDiscount(double total) {
        return total > 500 ? total * 0.9 : total; // 10% discount
    }

    @Override
    public double sell(int qty) {
        if (!checkExpiry() && reduceStock(qty)) {
            double total = price * qty;
            return applyDiscount(total);
        }
        return 0;
    }
}
