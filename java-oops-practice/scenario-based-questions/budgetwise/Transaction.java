
// Represents a single income or expense transaction
public class Transaction {

    private double amount;        // Encapsulated
    private String type;          // "INCOME" or "EXPENSE"
    private String date;
    private String category;

    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    // Getters 
    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }
}
