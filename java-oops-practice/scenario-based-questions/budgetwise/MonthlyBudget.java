// Monthly budget implementation
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit,
                         String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    // Polymorphic report
    @Override
    public void generateReport() {
        System.out.println("\n  Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + calculateNetSavings());
    }

    // Simplified overspend check (monthly)
    @Override
    public void detectOverspend() {
        System.out.println(" Monthly Overspending Check");

        if (getTotalExpenses() > limit) {
            System.out.println("Monthly budget limit exceeded!");
        } else {
            System.out.println("Spending within monthly limit.");
        }
    }
}
