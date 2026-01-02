package com.encapsulationandpolymorphism.banksystem;

public class SavingsAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan approved for Savings Account");
        } else {
            System.out.println("Loan rejected for Savings Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return balance >= amount * 0.5;
    }
}
