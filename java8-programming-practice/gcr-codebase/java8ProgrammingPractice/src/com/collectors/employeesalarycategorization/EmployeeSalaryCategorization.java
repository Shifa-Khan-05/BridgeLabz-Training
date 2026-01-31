package com.collectors.employeesalarycategorization;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class EmployeeSalaryCategorization {
 
	public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Amit", "IT", 50000),
                new Employee("Neha", "IT", 60000),
                new Employee("Rohit", "HR", 40000),
                new Employee("Sneha", "HR", 45000),
                new Employee("Arjun", "Finance", 70000)
        );
        
        Map<String, Double> empMap= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment
        		, Collectors.averagingDouble(Employee::getSalary)));
        
        empMap.forEach((name,avg)->
        System.out.println(name + "->" + avg));

	}
}
