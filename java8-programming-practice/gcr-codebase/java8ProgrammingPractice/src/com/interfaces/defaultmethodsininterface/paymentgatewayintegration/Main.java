package com.interfaces.defaultmethodsininterface.paymentgatewayintegration;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor payment = new UPIPayment();
        payment.pay(500);
        payment.refund(200);   // default method
    }
}
