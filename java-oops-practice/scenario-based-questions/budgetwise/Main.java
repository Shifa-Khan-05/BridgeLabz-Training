import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BudgetWise Finance Tracker ===");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        System.out.print("Choose type: ");
        int choice = sc.nextInt();

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Enter total budget limit: ");
        double limit = sc.nextDouble();

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] categories = new String[n];
        double[] limits = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Category name: ");
            categories[i] = sc.nextLine();
            System.out.print("Limit for " + categories[i] + ": ");
            limits[i] = sc.nextDouble();
            sc.nextLine();
        }

        Budget budget = (choice == 1)
                ? new MonthlyBudget(income, limit, categories, limits)
                : new AnnualBudget(income, limit, categories, limits);

        int option;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Transaction");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspending");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Type (INCOME/EXPENSE): ");
                    String type = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    budget.addTransaction(new Transaction(amt, type, date, cat));
                    break;

                case 2:
                    budget.generateReport(); // Polymorphism
                    break;

                case 3:
                    budget.detectOverspend();
                    break;

                case 4:
                    System.out.println("Exiting BudgetWise...");
                    break;
            }

        } while (option != 4);

        sc.close();
    }
}
