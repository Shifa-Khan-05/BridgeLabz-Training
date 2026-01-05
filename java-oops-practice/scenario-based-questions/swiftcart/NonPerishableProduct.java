class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, String category, int quantity) {
        super(name, price, category, quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.05;   // 5% discount
    }
}
