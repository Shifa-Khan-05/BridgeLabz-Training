package com.interfaces.interfaceimplementation.digitalpaymentsystem;


public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid rs" + amount + " using Credit Card");
    }
}
