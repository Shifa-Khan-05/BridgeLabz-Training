
public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, java.util.HashMap<String, Double> categories) {
        super(income, limit, categories);
    }

    // Polymorphic report
    public void generateReport() {
        System.out.println("=== Monthly Budget Report ===");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Net Savings: " + netSavings());
    }

    public void detectOverspend() {
        System.out.println("Overspending Check (Monthly):");
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : getTransactions()) {
                if (t.getCategory().equalsIgnoreCase(cat)) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(cat)) {
                System.out.println(cat + " exceeded limit!");
            }
        }
    }
}
