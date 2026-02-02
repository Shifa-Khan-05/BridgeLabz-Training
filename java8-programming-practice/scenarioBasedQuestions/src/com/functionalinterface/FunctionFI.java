package com.functionalinterface;

import java.util.function.Function;

public class FunctionFI {

    public static void main(String[] args) {

        double marks = 78;

        // Marks to grade
        Function<Double, Character> grade = m -> {
            if (m >= 90) return 'A';
            else if (m >= 75) return 'B';
            else if (m >= 60) return 'C';
            else return 'D';
        };
        System.out.println("Grade: " + grade.apply(marks));

        System.out.println("==============================================");

        double monthlySalary = 20000;

        // Monthly salary to annual salary
        Function<Double, Double> annualSalary = s -> s * 12;
        System.out.println("Annual Salary: " + annualSalary.apply(monthlySalary));

        System.out.println("==============================================");

        double productPrice = 5000;

        // Product price to discounted price
        Function<Double, Double> discount = p -> p - (p * 0.10);
        System.out.println("Discounted Price: " + discount.apply(productPrice));

        System.out.println("==============================================");

        String employeeName = "shifa khan";

        // Convert name to uppercase
        Function<String, String> upperCaseName = n -> n.toUpperCase();
        System.out.println("Uppercase Name: " + upperCaseName.apply(employeeName));
   
     // Convert Celsius temperature into Fahrenheit
        Function<Double, Double> fahrenheit = c -> (c * 9 / 5) + 32;
        double celsius = 25;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit.apply(celsius));

    
    
    }
}
