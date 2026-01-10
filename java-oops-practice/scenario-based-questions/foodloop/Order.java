import java.util.ArrayList;

class Order implements IOrderable {

    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;

    // Add item to order
    public void addItem(FoodItem item) {
        items.add(item);
    }

    // Calculate total with discount
    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }

        // Apply discount based on item type
        if (!items.isEmpty()) {
            double discount = items.get(0).applyDiscount(total);
            total -= discount;
        }
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully");
        System.out.println("Total Bill: rs " + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }
}
