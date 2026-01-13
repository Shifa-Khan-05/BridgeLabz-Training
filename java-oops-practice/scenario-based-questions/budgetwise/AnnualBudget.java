
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, java.util.HashMap<String, Double> categories) {
        super(income, limit, categories);
    }

    // Polymorphic report
    public void generateReport() {
        System.out.println("=== Annual Budget Report ===");
        System.out.println("Yearly Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Yearly Savings: " + netSavings());
    }

    public void detectOverspend() {
        System.out.println("Overspending Check (Annual):");
        if (totalExpenses() > limit) {
            System.out.println("Annual spending exceeded overall limit!");
        }
    }
}
