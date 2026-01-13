
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Base budget class
public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    // Category → Limit
    protected HashMap<String, Double> categoryLimits = new HashMap<>();

    // Encapsulated transaction list (cannot be edited directly)
    private List<Transaction> transactions = new ArrayList<>();

    // Constructor with custom categories
    public Budget(double income, double limit, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
    }

    // Controlled method to add expense/income
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Calculate total expenses
    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    // Operator usage: income - expenses
    public double netSavings() {
        return income - totalExpenses();
    }

    protected List<Transaction> getTransactions() {
        return transactions;
    }
}
