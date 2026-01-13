
public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    // Category data
    protected String[] categories;
    protected double[] categoryLimits;

    // Transactions stored in array
    protected Transaction[] transactions;
    protected int transactionCount = 0;

    public Budget(double income, double limit, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
        this.transactions = new Transaction[50]; // fixed size
    }

    // Encapsulation: controlled transaction addition
    public void addTransaction(Transaction t) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount++] = t;
        }
    }

    protected double totalExpenses() {
        double sum = 0;
        for (int i = 0; i < transactionCount; i++) {
            if (transactions[i].getType().equals("EXPENSE")) {
                sum += transactions[i].getAmount();
            }
        }
        return sum;
    }

    // Operator usage
    public double netSavings() {
        return income - totalExpenses();
    }
}
