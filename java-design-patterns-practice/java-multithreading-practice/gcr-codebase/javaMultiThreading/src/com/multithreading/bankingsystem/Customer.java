package com.multithreading.bankingsystem;

import java.sql.Timestamp;

public class Customer {

    private String customerName;
    private double amount;
    private String result;
    private Timestamp timestamp;

    public Customer(String customerName, double amount, String result, Timestamp timestamp) {
        this.customerName = customerName;
        this.amount = amount;
        this.result = result;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction [" +
                "Customer=" + customerName +
                ", Amount=" + amount +
                ", Status=" + result +
                ", Time=" + timestamp +
                "]";
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getResult() {
        return result;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
