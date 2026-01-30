package com.interfaces.interfaceimplementation.digitalpaymentsystem;


public class Main {

    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1500);
        wallet.pay(300);
    }
}
