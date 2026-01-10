class NonVegItem extends FoodItem {

    public NonVegItem(String name, String category, double price,
                      String availability, int stock) {
        super(name, category, price, availability, stock);
    }

    @Override
    double applyDiscount(double total) {
        return total * 0.30; // 30% discount
    }
}
