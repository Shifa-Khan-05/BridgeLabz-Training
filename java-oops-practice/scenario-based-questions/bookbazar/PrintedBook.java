public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        if (quantity >= 3) {
            return price * quantity * 0.10; // bulk discount
        }
        return 0;
    }
}
