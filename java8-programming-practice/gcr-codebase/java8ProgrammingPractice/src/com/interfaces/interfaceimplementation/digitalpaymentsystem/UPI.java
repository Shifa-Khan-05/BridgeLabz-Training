package com.interfaces.interfaceimplementation.digitalpaymentsystem;


public class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid rs" + amount + " using UPI");
    }
}
