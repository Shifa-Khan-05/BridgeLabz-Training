package com.optionalclass.officesystem;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Office {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(
                        1,
                        "Amit",
                        Optional.of("Kumar"),
                        "amit@company.com",
                        Optional.of("Ramesh"),
                        Optional.of(5000),
                        Arrays.asList("Health", "Life")
                ),
                new Employee(
                        2,
                        "Sneha",
                        Optional.empty(),
                        "sneha@company.com",
                        Optional.empty(),
                        Optional.empty(),
                        null
                )
        );

        Employee emp = employees.get(1);

        System.out.println("==============================================");

        // 1. Fetch manager details
        System.out.println("Manager:");
        emp.getManager()
                .ifPresentOrElse(
                        m -> System.out.println(m),
                        () -> System.out.println("Manager not assigned")
                );

        System.out.println("==============================================");

        // 2. Fetch bonus amount (default 0)
        int bonusAmount = emp.getBonus().orElse(0);
        System.out.println("Bonus Amount: " + bonusAmount);

        System.out.println("==============================================");

        // 3. Find employee by email (EASY WAY)
        String searchEmail = "abc@company.com";

        Optional<Employee> foundEmployee =
                employees.stream()
                        .filter(e -> e.getEmail().equals(searchEmail))
                        .findFirst();

        if (foundEmployee.isPresent()) {
            System.out.println("Employee Found: " +
                    foundEmployee.get().getName());
        } else {
            System.out.println("Employee not available");
        }

        System.out.println("==============================================");

        // 4. Get insurance details safely
        Optional.ofNullable(emp.getInsuranceDetails())
                .filter(list -> !list.isEmpty())
                .ifPresentOrElse(
                        list -> list.forEach(
                                i -> System.out.println("Insurance: " + i)
                        ),
                        () -> System.out.println("No insurance details available")
                );

        System.out.println("==============================================");

        // 5. Display middle name only if present
        emp.getMiddleName()
                .ifPresent(m -> System.out.println("Middle Name: " + m));
    }
}
