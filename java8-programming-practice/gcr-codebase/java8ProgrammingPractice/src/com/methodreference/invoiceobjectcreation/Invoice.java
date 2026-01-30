package com.methodreference.invoiceobjectcreation;


public class Invoice {

    private int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId=" + transactionId + "}";
    }
}
