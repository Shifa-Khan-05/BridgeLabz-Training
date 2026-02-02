package com.lambdaexpression.officesystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class OfficeSystem {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Abhay", 300000.0, 2020));
        employees.add(new Employee(2, "Sneha", 450000.0, 2018));
        employees.add(new Employee(3, "Rahul", 550000.0, 2016));
        employees.add(new Employee(4, "Pooja", 400000.0, 2019));
        employees.add(new Employee(5, "Karan", 650000.0, 2015));
        employees.add(new Employee(6, "Neha", 500000.0, 2017));
        employees.add(new Employee(7, "Amit", 350000.0, 2021));

        // Predicate to check bonus eligibility based on salary
        Predicate<Double> getBonus = salary -> salary > 300000;

//        // Apply predicate to each employee
//        employees.forEach(e -> {
//            if (getBonus.test(e.getSalary())) {
//                System.out.println(e.getName() + " is eligible for bonus");
//            } else {
//                System.out.println(e.getName() + " is not eligible for bonus");
//            }
//        });
        Predicate<Employee> bonusEligible = e -> e.getSalary() > 30000;
        employees.forEach(e ->
                System.out.println(e.getName() + " Bonus Eligible: " + bonusEligible.test(e))
        );

        System.out.println("================================");

        // 2. Sort employees by salary
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);

        System.out.println("================================");

        // 3. Promotion eligibility (experience > 3 years)
        Predicate<Employee> promotionEligible =
                e -> (2025 - e.getYearOfJoining()) > 3;

        employees.forEach(e ->
                System.out.println(e.getName() + " Promotion Eligible: " +
                        promotionEligible.test(e))
        );

        System.out.println("================================");

        // 4. Print employee details
        employees.forEach(e -> System.out.println(e));

        System.out.println("================================");

        // 5. Compare two employees’ salaries
        Comparator<Employee> salaryCompare =
                (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());

        System.out.println(
                salaryCompare.compare(employees.get(0), employees.get(1))
        );


    }
}
