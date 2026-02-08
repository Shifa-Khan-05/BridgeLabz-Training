package com.banktransactions;

import java.util.HashMap;
import java.util.Map;

class Bank {

    private final Map<Integer, Integer> accounts = new HashMap<>();

    // Create account
    public synchronized void createAccount(int accountNumber, int initialBalance) {
        accounts.put(accountNumber, initialBalance);
        System.out.println("Account created: " + accountNumber +
                " | Balance: " + initialBalance);
    }

    // Deposit method (thread-safe)
    public void deposit(int accountNumber, int amount) {
        synchronized (this) {
            int balance = accounts.get(accountNumber);
            balance += amount;
            accounts.put(accountNumber, balance);
            System.out.println(Thread.currentThread().getName() +
                    " deposited " + amount +
                    " | Account: " + accountNumber +
                    " | Balance: " + balance);
        }
    }

    // Withdraw method (thread-safe)
    public void withdraw(int accountNumber, int amount) {
        synchronized (this) {
            int balance = accounts.get(accountNumber);

            if (balance >= amount) {
                balance -= amount;
                accounts.put(accountNumber, balance);
                System.out.println(Thread.currentThread().getName() +
                        " withdrew " + amount +
                        " | Account: " + accountNumber +
                        " | Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() +
                        " tried to withdraw " + amount +
                        " | Account: " + accountNumber +
                        " | Insufficient Balance");
            }
        }
    }

    // Get balance (thread-safe)
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
