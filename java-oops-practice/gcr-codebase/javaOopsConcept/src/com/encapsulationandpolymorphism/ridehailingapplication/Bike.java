package com.encapsulationandpolymorphism.ridehailingapplication;

public class Bike extends Vehicle {

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) - 20; // discount
    }
}
