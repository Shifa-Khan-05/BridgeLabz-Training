
import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Budget Limit: ");
        double limit = sc.nextDouble();

        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] categories = new String[n];
        double[] categoryLimits = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Category name: ");
            categories[i] = sc.nextLine();
            System.out.print("Limit: ");
            categoryLimits[i] = sc.nextDouble();
            sc.nextLine();
        }

        Budget budget;
        if (choice == 1) {
            budget = new MonthlyBudget(income, limit, categories, categoryLimits);
        } else {
            budget = new AnnualBudget(income, limit, categories, categoryLimits);
        }

        int option;
        do {
            System.out.println("\n1. Add Expense");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspending");
            System.out.println("4. Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Category: ");
                    String cat = sc.nextLine();
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    budget.addTransaction(new Transaction(amt, "EXPENSE", "Today", cat));
                    break;

                case 2:
                    budget.generateReport();
                    break;

                case 3:
                    budget.detectOverspend();
                    break;
            }

        } while (option != 4);

        sc.close();
    }
}
