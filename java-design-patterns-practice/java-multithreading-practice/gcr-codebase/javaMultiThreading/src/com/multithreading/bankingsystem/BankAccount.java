package com.multithreading.bankingsystem;


public class BankAccount {

    private double balance = 10000;

    public synchronized void withdraw(String customerName, double amount) {

        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount);

        
        
        
       

        if (balance >= amount) {
            balance -= amount;
            System.out.println(
            		
            		
                    "Transaction SUCCESS | Customer: " + customerName +
                    ", Amount: " + amount +
                    ", Remaining Balance: " + balance
            );
        } else {
            System.out.println(
                    "Transaction FAILED | Customer: " + customerName +
                    ", Amount: " + amount +
                    ", Reason: Insufficient Balance"
            );
        }
    }

    public double getBalance() {
        return balance;
    }
}
