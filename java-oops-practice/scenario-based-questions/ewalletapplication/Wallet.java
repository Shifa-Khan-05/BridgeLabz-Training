import java.util.ArrayList;

abstract class Wallet implements Transferrable {

    // Sensitive data
    private double balance;

    protected ArrayList<Transaction> history = new ArrayList<>();

    // Constructor without referral bonus
    public Wallet() {
        this.balance = 0;
    }

    // Constructor with referral bonus
    public Wallet(double referralBonus) {
        this.balance = referralBonus;
        history.add(new Transaction("Referral Bonus", referralBonus));
    }

    // Controlled access
    public double getBalance() {
        return balance;
    }

    // Protected balance update (not public!)
    protected void addBalance(double amount) {
        balance += amount; // Operator +
        history.add(new Transaction("Money Added", amount));
    }

    protected boolean deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount; // Operator -
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : history) {
            t.showTransaction();
        }
    }
}
