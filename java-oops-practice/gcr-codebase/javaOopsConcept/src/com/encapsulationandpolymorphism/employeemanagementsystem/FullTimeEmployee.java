package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee{
   

	public FullTimeEmployee(int employeeId , String employeeName, double fixedSalary) {
		super(employeeId, employeeName, fixedSalary);
		
	}
	@Override
	public double calculateSalary() {
		
		return baseSalary;
	}
}
