
import java.util.HashMap;
import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Budget budget;

        System.out.println("Choose Budget Type:");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter total income: ");
        double income = sc.nextDouble();

        System.out.print("Enter spending limit: ");
        double limit = sc.nextDouble();

        HashMap<String, Double> categories = new HashMap<>();
        sc.nextLine();

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Category name: ");
            String cat = sc.nextLine();
            System.out.print("Limit for " + cat + ": ");
            double catLimit = sc.nextDouble();
            sc.nextLine();
            categories.put(cat, catLimit);
        }

        // Polymorphic object creation
        if (choice == 1) {
            budget = new MonthlyBudget(income, limit, categories);
        } else {
            budget = new AnnualBudget(income, limit, categories);
        }

        int option;
        do {
            System.out.println("\n1. Add Expense");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspending");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    budget.addTransaction(new Transaction(amt, "EXPENSE", category));
                    break;

                case 2:
                    budget.generateReport();
                    break;

                case 3:
                    budget.detectOverspend();
                    break;

                case 4:
                    System.out.println("Exiting BudgetWise...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (option != 4);

        sc.close();
    }
}
