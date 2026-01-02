package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount(double price) {
        return price > 5000 ? price * 0.20 : price * 0.10;
    }
}
