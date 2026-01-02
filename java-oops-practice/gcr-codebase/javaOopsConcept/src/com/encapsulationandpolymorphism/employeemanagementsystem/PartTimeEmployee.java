package com.encapsulationandpolymorphism.employeemanagementsystem;

class PartTimeEmployee extends Employee {

    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int workHours, double hourlyRate) {
        super(id, name, 0);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}
