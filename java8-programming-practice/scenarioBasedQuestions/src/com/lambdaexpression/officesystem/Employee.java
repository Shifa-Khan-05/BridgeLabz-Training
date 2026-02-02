package com.lambdaexpression.officesystem;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private int yearOfJoining;

    // Constructor
    public Employee(int id, String name, double salary, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
