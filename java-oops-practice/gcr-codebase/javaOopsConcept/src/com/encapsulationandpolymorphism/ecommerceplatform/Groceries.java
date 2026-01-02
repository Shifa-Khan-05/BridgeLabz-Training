package com.encapsulationandpolymorphism.ecommerceplatform;

public class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount(double price) {
        return price > 2000 ? price * 0.05 : price * 0.02;
    }
}
