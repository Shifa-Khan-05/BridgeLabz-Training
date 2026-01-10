import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create Order object
        Order order = new Order();

        // Ask user how many items to order
        System.out.print("Enter number of items to order: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Loop to take details for each food item
        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Item " + i);

            // Choose food type
            System.out.print("Item Type (1-Veg, 2-NonVeg): ");
            int type = sc.nextInt();
            sc.nextLine(); // consume newline

            // Read food name
            System.out.print("Item Name: ");
            String name = sc.nextLine();

            // Read category
            System.out.print("Category: ");
            String category = sc.nextLine();

            // Read price
            System.out.print("Price: ");
            double price = sc.nextDouble();

            // Read availability
            sc.nextLine(); // consume newline
            System.out.print("Availability: ");
            String availability = sc.nextLine();

            // Read stock quantity
            System.out.print("Stock: ");
            int stock = sc.nextInt();

            FoodItem item;

            // Create Veg or NonVeg item using polymorphism
            if (type == 1) {
                item = new VegItem(name, category, price, availability, stock);
            } else {
                item = new NonVegItem(name, category, price, availability, stock);
            }

            // Add item to order
            order.addItem(item);
        }

        // Place the order and calculate total bill
        order.placeOrder();

        // Close scanner
        sc.close();
    }
}
