// Shopkeeper’s Discount Dashboard 🛍️
// A shopkeeper gives discounts based on total bill

import java.util.*;   // Importing utility package for Scanner class

// Main class for Discount Dashboard
class DiscountDashboard {

    // Method to calculate discount based on total bill amount
    public static void discountCalculator() {

        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Displaying welcome message
        System.out.println("========================================");
        System.out.println("  WELCOME TO SHOPKEEPER DISCOUNT ZONE ");
        System.out.println("========================================\n");

        // Displaying discount offer details
        System.out.println(" Offer Details:");
        System.out.println(" Buy 10 items and get exciting discounts!");
        System.out.println(" Bill > Rs10,000  -> 50% Discount");
        System.out.println(" Bill > Rs5,000   -> 30% Discount");
        System.out.println(" Bill ≤ Rs5,000   -> 10% Discount\n");

        // Total number of items to be entered
        int items = 10;

        // Variable to store total bill amount
        double bill = 0;

        // Asking user to enter item prices
        System.out.println(" Enter the price of 10 items:");

        // Loop to take price of each item and calculate total bill
        while (items > 0) {
            System.out.print("Item " + (11 - items) + " price: Rs ");
            double price = scanner.nextDouble(); // Taking item price
            bill += price;                       // Adding price to total bill
            items--;                             // Decreasing item count
        }

        // Storing original bill before discount
        double originalBill = bill;

        System.out.println("\n----------------------------------------");

        // Applying discount based on bill amount
        if (bill >= 10000) {
            bill *= 0.5;  // 50% discount
            System.out.println(" Congratulations! You got 50% discount!");
        } 
        else if (bill > 5000 && bill < 10000) {
            bill *= 3 / 10;  // 30% discount
            System.out.println(" Great! You got 30% discount!");
        } 
        else {
            bill *= 0.1;  // 10% discount
            System.out.println(" You got 10% discount!");
        }

        // Displaying final bill summary
        System.out.println("----------------------------------------");
        System.out.println(" Original Bill Amount : rs " + originalBill);
        System.out.println(" Final Bill to Pay    : rs " + bill);
        System.out.println("----------------------------------------");

        // Thank you message
        System.out.println(" Thank you for shopping with us!");
    }

    // Main method – program execution starts here
    public static void main(String[] args) {
        discountCalculator();   // Calling discount calculation method
    }
}
