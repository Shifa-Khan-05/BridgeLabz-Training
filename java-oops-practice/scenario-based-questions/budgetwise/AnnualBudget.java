public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    public void generateReport() {
        System.out.println("=== Annual Budget Report ===");
        System.out.println("Yearly Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Yearly Savings: " + netSavings());
    }

    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("Overall annual budget exceeded!");
        } else {
            System.out.println("Spending is within annual limit.");
        }
    }
}
