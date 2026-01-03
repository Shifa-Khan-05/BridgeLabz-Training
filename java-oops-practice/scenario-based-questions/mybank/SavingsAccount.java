public class SavingsAccount extends Account {

    private final double interestRate = 4.0;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
