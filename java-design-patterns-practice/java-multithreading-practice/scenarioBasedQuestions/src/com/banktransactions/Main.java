package com.banktransactions;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        int accountNumber = 101;
        bank.createAccount(accountNumber, 5000);

        // Create multiple customers (threads)
        Customer c1 = new Customer("Customer-1", bank, accountNumber);
        Customer c2 = new Customer("Customer-2", bank, accountNumber);
        Customer c3 = new Customer("Customer-3", bank, accountNumber);

        // Start threads
        c1.start();
        c2.start();
        c3.start();

        // Wait for all threads to finish
        c1.join();
        c2.join();
        c3.join();

        System.out.println("\nFinal Balance: " +
                bank.getBalance(accountNumber));
    }
}
