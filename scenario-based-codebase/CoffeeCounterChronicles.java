import java.util.*;

// Creating a public class
public class CoffeeCounterChronicles {

    // Method to take coffee order and calculate bill
    public static void typeOfCoffee() {

        // Scanner object is created to take input from user
        Scanner sc = new Scanner(System.in);

        // Variable to store user choice (yes or exit)
        String input;

        // GST rate (18%)
        double gstRate = 0.18;

        // While loop to serve multiple customers
        while (true) {

            // Asking user whether to continue or exit
            System.out.println("\nEnter 'yes' to order coffee or 'exit' to stop:");
            input = sc.next();

            // If user types exit, program will stop
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe");
                break;
            }

            // Displaying coffee menu with prices
            System.out.println("\nEnter the name of coffee:");
            System.out.println("Espresso - 20");
            System.out.println("Americano - 50");
            System.out.println("Cappuccino - 70");
            System.out.println("Latte - 60");
            System.out.println("Iced Coffee - 36");
            System.out.println("Black Coffee - 70");
            System.out.println("Caramel Latte - 60");
            System.out.println("Hazelnut Coffee - 40");
            System.out.println("South Indian Filter Coffee - 90");
            System.out.println("Mocha - 100");

            //taking coffee name input
            sc.nextLine();
            String coffee = sc.nextLine();

            // Taking quantity input from user
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();

            // Variable to store coffee price
            int price = 0;

            // Switch case to assign price based on coffee type
            switch (coffee) {
                case "Espresso": price = 20; break;
                case "Americano": price = 50; break;
                case "Cappuccino": price = 70; break;
                case "Latte": price = 60; break;
                case "Iced Coffee": price = 36; break;
                case "Black Coffee": price = 70; break;
                case "Caramel Latte": price = 60; break;
                case "Hazelnut Coffee": price = 40; break;
                case "South Indian Filter Coffee": price = 90; break;
                case "Mocha": price = 100; break;

                // Default case if coffee name is invalid
                default:
                    System.out.println("Invalid coffee type entered!");
                    continue;
            }

            // Calculating base bill amount
            int bill = price * quantity;

            // Calculating GST amount
            double gst = bill * gstRate;

            // Calculating total bill including GST
            double totalBill = bill + gst;

            // Displaying bill details
            System.out.println("Base Amount: Rs" + bill);
            System.out.println("GST (18%): Rs" + gst);
            System.out.println("Total Bill: Rs" + totalBill);
        }

        // Closing the scanner
        sc.close();
    }

    // Main method
    public static void main(String args[]) {

        // Calling the method
        typeOfCoffee();
    }
}
