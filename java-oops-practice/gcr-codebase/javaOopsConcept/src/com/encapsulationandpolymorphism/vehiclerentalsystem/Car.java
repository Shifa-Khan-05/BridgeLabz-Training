package com.encapsulationandpolymorphism.vehiclerentalsystem;

public class Car extends Vehicle {

    public Car(int number, double rate, String policy) {
        super(number, "Car", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
