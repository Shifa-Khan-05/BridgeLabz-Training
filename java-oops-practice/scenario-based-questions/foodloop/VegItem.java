class VegItem extends FoodItem {

    public VegItem(String name, String category, double price,
                   String availability, int stock) {
        super(name, category, price, availability, stock);
    }

    @Override
    double applyDiscount(double total) {
        return total * 0.20; // 20% discount
    }
}
