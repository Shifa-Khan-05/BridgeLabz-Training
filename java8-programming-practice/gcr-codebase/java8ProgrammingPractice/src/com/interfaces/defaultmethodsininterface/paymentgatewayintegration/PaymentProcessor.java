package com.interfaces.defaultmethodsininterface.paymentgatewayintegration;

public interface PaymentProcessor {

    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refunding amount: " + amount);
    }
}
