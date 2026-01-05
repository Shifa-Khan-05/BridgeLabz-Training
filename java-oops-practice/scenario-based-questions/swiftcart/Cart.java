import java.util.ArrayList;

class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    Cart() {
        products = new ArrayList<>();
    }

    Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    void addProduct(Product p) {
        products.add(p);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    public double applyDiscount() {
        double discount = 0;
        for (Product p : products) {
            discount += p.getDiscount();
        }
        return discount;
    }

    public void generateBill() {
        System.out.println("\n--- SwiftCart Bill ---");
        for (Product p : products) {
            System.out.println(
                p.name + "  Qty:" + p.quantity +
                "  Price:" + p.price +
                "  Total:" + p.getTotalPrice()
            );
        }

        double discount = applyDiscount();
        System.out.println("Total Price : " + totalPrice);
        System.out.println("Discount    : " + discount);
        System.out.println("Final Amount: " + (totalPrice - discount));
    }
}
