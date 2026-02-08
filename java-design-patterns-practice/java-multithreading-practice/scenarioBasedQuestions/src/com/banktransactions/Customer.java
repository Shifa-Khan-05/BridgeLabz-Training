package com.banktransactions;

class Customer extends Thread {

    private final Bank bank;
    private final int accountNumber;

    public Customer(String name, Bank bank, int accountNumber) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {
        bank.deposit(accountNumber, 1000);
        bank.withdraw(accountNumber, 500);
        bank.deposit(accountNumber, 2000);
        bank.withdraw(accountNumber, 1500);
    }
}
