package com.inheritance.assistedquestions.employeemanagementsystem;

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role     : Manager");
        System.out.println("Team Size: " + teamSize);
    }
}
