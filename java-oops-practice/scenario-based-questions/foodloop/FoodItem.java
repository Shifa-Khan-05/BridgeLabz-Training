abstract class FoodItem {

    private String name;
    private String category;
    protected double price;
    protected String availability;
    private int stock; // hidden stock

    public FoodItem(String name, String category, double price,
                    String availability, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
        this.stock = stock;
    }

    // Reduce stock safely
    protected boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    // Polymorphic discount
    abstract double applyDiscount(double total);
}
