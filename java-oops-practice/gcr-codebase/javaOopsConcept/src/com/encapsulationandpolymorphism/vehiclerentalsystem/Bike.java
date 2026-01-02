package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Bike extends Vehicle {

    public Bike(int number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) - 50; // discount for bikes
    }
}
