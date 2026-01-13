// Annual budget implementation
public class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                        String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    // Polymorphic report
    @Override
    public void generateReport() {
        System.out.println("\n  Annual Budget Report");
        System.out.println("Annual Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    // Annual overspend check
    @Override
    public void detectOverspend() {
        System.out.println(" Annual Overspending Check");
        System.out.println(" Annual Overspending Check");

        if (getTotalExpenses() > limit) {
            System.out.println("Overall annual budget exceeded!");
        } else {
            System.out.println("Spending within annual limit.");
        }
    }
}
