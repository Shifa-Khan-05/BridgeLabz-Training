package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount(double price) {
        return price > 10000 ? price * 0.15 : price * 0.10;
    }
}
