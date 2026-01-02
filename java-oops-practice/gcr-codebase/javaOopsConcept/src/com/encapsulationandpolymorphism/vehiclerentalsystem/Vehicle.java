package com.encapsulationandpolymorphism.vehiclerentalsystem;

public abstract class Vehicle implements Insurable {

    // Encapsulation
    private int vehicleNumber;
    private String type;
    protected double rentalRate;

    // Sensitive detail
    private String insurancePolicyNumber;

    public Vehicle(int vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Getter (controlled access)
    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Interface methods
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10; // 10% insurance
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy No: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4));
        System.out.println("Insurance Cost per Day: " + calculateInsurance());
    }
}
