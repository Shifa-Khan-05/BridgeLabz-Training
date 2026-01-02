package com.encapsulationandpolymorphism.banksystem;

public class CurrentAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan approved for Current Account");
        } else {
            System.out.println("Loan rejected for Current Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return balance >= amount;
    }
}
