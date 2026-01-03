import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = null;

        try {
            // Account creation
            System.out.println("Select Account Type:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Enter choice: ");
            int accChoice = sc.nextInt();

            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter Opening Balance: ");
            double balance = sc.nextDouble();

            switch (accChoice) {
                case 1:
                    account = new SavingsAccount(accNo, balance);
                    break;
                case 2:
                    account = new CurrentAccount(accNo, balance);
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Savings Account.");
                    account = new SavingsAccount(accNo, balance);
            }

            int choice;
            do {
                System.out.println("\n----- MYBANK MENU -----");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Calculate Interest");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        account.checkBalance();
                        break;

                    case 4:
                        System.out.println("Interest: " + account.calculateInterest());
                        break;

                    case 5:
                        System.out.println("Thank you for using MyBank.");
                        break;

                    default:
                        System.out.println("Invalid option!");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }

        sc.close();
    }
}
