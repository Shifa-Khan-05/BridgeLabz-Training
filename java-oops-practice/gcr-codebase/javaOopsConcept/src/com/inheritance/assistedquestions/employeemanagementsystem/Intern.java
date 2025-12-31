package com.inheritance.assistedquestions.employeemanagementsystem;

class Intern extends Employee {

    int duration; // internship duration in months

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role     : Intern");
        System.out.println("Duration : " + duration + " months");
    }
}
