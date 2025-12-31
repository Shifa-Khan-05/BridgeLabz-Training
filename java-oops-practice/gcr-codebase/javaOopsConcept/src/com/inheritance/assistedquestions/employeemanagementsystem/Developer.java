package com.inheritance.assistedquestions.employeemanagementsystem;

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role      : Developer");
        System.out.println("Language  : " + programmingLanguage);
    }
}

