package com.inheritance.assistedquestions.employeemanagementsystem;

public class Main {
	
	    public static void main(String[] args) {

	        Employee e1 = new Manager("Amit", 101, 80000, 10);
	        Employee e2 = new Developer("Shifa", 102, 60000, "Java");
	        Employee e3 = new Intern("Rahul", 103, 15000, 6);

	        e1.displayDetails();
	        System.out.println("-------------------");
	        e2.displayDetails();
	        System.out.println("-------------------");
	        e3.displayDetails();
	    }

}
