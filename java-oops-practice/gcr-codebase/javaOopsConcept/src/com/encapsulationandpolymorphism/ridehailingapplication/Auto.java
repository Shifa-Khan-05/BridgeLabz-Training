package com.encapsulationandpolymorphism.ridehailingapplication;

public class Auto extends Vehicle {

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 30; // extra charge
    }
}