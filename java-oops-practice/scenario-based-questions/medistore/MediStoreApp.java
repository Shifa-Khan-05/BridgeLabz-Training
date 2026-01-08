import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- Medicine Type ----
        System.out.print("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection): ");
        int type = sc.nextInt();
        sc.nextLine(); // consume newline

        // ---- Common Inputs ----
        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per Unit: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String date = sc.next();
        LocalDate expiryDate = LocalDate.parse(date);

        Medicine medicine;

        // ---- Polymorphic Object Creation ----
        if (type == 1) {
            medicine = new Tablet(name, price, expiryDate);
        } 
        else if (type == 2) {
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            medicine = new Syrup(name, price, expiryDate, qty);
        } 
        else {
            medicine = new Injection(name, price, expiryDate);
        }

        // ---- Sale ----
        System.out.print("Enter quantity to sell: ");
        int sellQty = sc.nextInt();

        double bill = medicine.sell(sellQty);

        // ---- Output ----
        if (bill > 0) {
            System.out.println(" Sale Successful");
            System.out.println(" Total Bill: ₹" + bill);
            System.out.println(" Remaining Stock: " + medicine.getQuantity());
        } else {
            System.out.println(" Sale Failed (Expired or Insufficient Stock)");
        }

        sc.close();
    }
}
