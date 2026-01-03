
public class CurrentAccount extends Account {

    private final double interestRate = 2.0;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
