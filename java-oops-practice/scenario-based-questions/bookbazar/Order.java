import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private String status = "CREATED";

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Insufficient stock for: " + book.getTitle());
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();

            double price = book.getPrice() * quantity;
            double discount = book.applyDiscount(quantity);

            total += (price - discount); // operators used
        }
        return total;
    }

    protected void updateStatus(String status) { // restricted access
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
