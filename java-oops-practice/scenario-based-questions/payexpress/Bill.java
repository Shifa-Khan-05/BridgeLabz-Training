import java.time.LocalDate;

// Abstract base class for all bills
public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    // Payment status is PRIVATE (Encapsulation)
    private boolean isPaid;

    // Constructor for recurring bills
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Public method to check status (read-only)
    public boolean isPaid() {
        return isPaid;
    }

    // Protected method to update payment status
    protected void markAsPaid() {
        this.isPaid = true;
    }

    // Late fee calculation using operators
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Display bill details
    public void showBill() {
        System.out.println("Bill Type : " + type);
        System.out.println("Amount   : ₹" + amount);
        System.out.println("Due Date : " + dueDate);
        System.out.println("Status   : " + (isPaid ? "PAID" : "UNPAID"));
    }
}
