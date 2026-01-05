class PerishableProduct extends Product {

    PerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.10;   // 10% discount
    }
}
