public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    public void generateReport() {
        System.out.println("=== Monthly Budget Report ===");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    public void detectOverspend() {
        for (int i = 0; i < categories.length; i++) {
            double spent = 0;
            for (int j = 0; j < transactionCount; j++) {
                if (transactions[j].getCategory().equals(categories[i])) {
                    spent += transactions[j].getAmount();
                }
            }
            if (spent > categoryLimits[i]) {
                System.out.println("Overspent in category: " + categories[i]);
            }
        }
    }
}
