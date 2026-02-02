package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateFI {

    public static void main(String[] args) {

        // Sample input values for different scenarios
        int attendance = 96;
        double salary = 134322.45;
        double balance = 2345678;
        double withdrawalAmount = 123;
        int number = 4;

        // ============================================================
        // Scenario 1: Student Exam Eligibility
        // Condition: Attendance must be greater than or equal to 75%
        // ============================================================
        Predicate<Integer> examEligibility = a -> a >= 75;
        System.out.println("Exam Eligibility Check:");
        System.out.println("Attendance: " + attendance);
        System.out.println("Eligible for exam? " + examEligibility.test(attendance));

        // ============================================================
        // Scenario 2: Employee Salary Validation
        // Condition: Salary must be greater than 30,000
        // ============================================================
        Predicate<Double> salaryCheck = s -> s > 30000;
        System.out.println("\nSalary Eligibility Check:");
        System.out.println("Salary: " + salary);
        System.out.println("Salary above 30,000? " + salaryCheck.test(salary));

        // ============================================================
        // Scenario 3: Bank Withdrawal Validation
        // Condition: Withdrawal amount must be less than available balance
        // ============================================================
        Predicate<Double> withdrawalCheck = amt -> amt <= balance;
        System.out.println("\nBank Withdrawal Validation:");
        System.out.println("Account Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("Withdrawal allowed? " + withdrawalCheck.test(withdrawalAmount));

        // ============================================================
        // Scenario 4: E-commerce Free Delivery Eligibility
        // Condition: Order amount must be >= 1000
        // ============================================================
        Predicate<Double> freeDeliveryCheck = orderAmount -> orderAmount >= 1000;
        System.out.println("\nFree Delivery Eligibility:");
        System.out.println("Order Amount: " + withdrawalAmount);
        System.out.println("Eligible for free delivery? " + freeDeliveryCheck.test(withdrawalAmount));

        // ============================================================
        // Scenario 5: Even or Odd Number Check
        // Condition: Number divisible by 2
        // ============================================================
        Predicate<Integer> evenOddCheck = n -> n % 2 == 0;
        System.out.println("\nEven/Odd Number Check:");
        System.out.println("Number: " + number);

        if (evenOddCheck.test(number)) {
            System.out.println("Result: The number is EVEN");
        } else {
            System.out.println("Result: The number is ODD");
        }
    }
}
