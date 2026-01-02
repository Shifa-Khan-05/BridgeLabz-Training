package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Truck extends Vehicle {

    public Truck(int number, double rate, String policy) {
        super(number, "Truck", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 500; // heavy vehicle charge
    }
}
