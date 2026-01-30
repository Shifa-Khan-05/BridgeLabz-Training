package com.interfaces.defaultmethodsininterface.paymentgatewayintegration;


public class UPIPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
