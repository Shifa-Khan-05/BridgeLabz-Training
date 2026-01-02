package com.encapsulationandpolymorphism.banksystem;

public interface Lonable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}
