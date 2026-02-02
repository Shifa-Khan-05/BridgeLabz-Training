package com.functionalinterface;

import java.util.Comparator;

public class ComparatorFI {

    public static void main(String[] args) {

        // 1. Compare two students by rank
        Comparator<Integer> compareStudentRank =
                (r1, r2) -> Integer.compare(r1, r2);

        System.out.println("Student Rank Comparison: " +
                compareStudentRank.compare(10, 20));

        System.out.println("==============================================");

        // 2. Compare two employees by salary
        Comparator<Double> compareEmployeeSalary =
                (s1, s2) -> Double.compare(s1, s2);

        System.out.println("Employee Salary Comparison: " +
                compareEmployeeSalary.compare(50000.0, 40000.0));

        System.out.println("==============================================");

        // 3. Compare two products by price
        Comparator<Double> compareProductPrice =
                (p1, p2) -> Double.compare(p1, p2);

        System.out.println("Product Price Comparison: " +
                compareProductPrice.compare(1200.0, 1500.0));

        System.out.println("==============================================");

        // 4. Compare two strings by length
        Comparator<String> compareStringLength =
                (s1, s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println("String Length Comparison: " +
                compareStringLength.compare("Java", "Streams"));

        System.out.println("==============================================");

        // 5. Compare two bank account balances
        Comparator<Double> compareAccountBalance =
                (b1, b2) -> Double.compare(b1, b2);

        System.out.println("Account Balance Comparison: " +
                compareAccountBalance.compare(5000.0, 8000.0));
    }
}
