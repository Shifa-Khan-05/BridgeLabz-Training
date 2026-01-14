import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bill bill = null;

        int choice;
        do {
            System.out.println("\n=== PayXpress Utility Bill System ===");
            System.out.println("1. Create Electricity Bill");
            System.out.println("2. Create Internet Bill");
            System.out.println("3. Create Water Bill");
            System.out.println("4. Pay Bill");
            System.out.println("5. Send Reminder");
            System.out.println("6. Show Bill Details");
            System.out.println("7. Calculate Late Fee");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    String date = sc.next();
                    LocalDate dueDate = LocalDate.parse(date);

                    if (choice == 1)
                        bill = new ElectricityBill(amount, dueDate);
                    else if (choice == 2)
                        bill = new InternetBill(amount, dueDate);
                    else
                        bill = new WaterBill(amount, dueDate);

                    System.out.println("Bill created successfully.");
                    break;

                case 4:
                    if (bill != null && !bill.isPaid()) {
                        bill.pay();
                    } else {
                        System.out.println("No unpaid bill available.");
                    }
                    break;

                case 5:
                    if (bill != null) {
                        bill.sendReminder(); // Polymorphism
                    } else {
                        System.out.println("No bill available.");
                    }
                    break;

                case 6:
                    if (bill != null) {
                        bill.showBill();
                    } else {
                        System.out.println("No bill available.");
                    }
                    break;

                case 7:
                    if (bill != null) {
                        System.out.print("Enter penalty amount: ");
                        double penalty = sc.nextDouble();
                        System.out.println("Total Payable (with late fee): ₹" +
                                bill.calculateLateFee(penalty));
                    }
                    break;

                case 0:
                    System.out.println("Exiting PayXpress...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
