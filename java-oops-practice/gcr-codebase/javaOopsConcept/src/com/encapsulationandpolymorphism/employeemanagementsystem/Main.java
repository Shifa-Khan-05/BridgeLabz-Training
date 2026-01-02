package com.encapsulationandpolymorphism.employeemanagementsystem;
import java.util.*;

public class Main {
	 public static void main(String[] args) {

	        List<Employee> employees = new ArrayList<>();

	        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
	        Employee e2 = new PartTimeEmployee(102, "Riya", 80, 400);

	        e1.assignDepartment("IT");
	        e2.assignDepartment("HR");

	        employees.add(e1);
	        employees.add(e2);

	       
	        
	        // Polymorphism: Employee reference
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
}
