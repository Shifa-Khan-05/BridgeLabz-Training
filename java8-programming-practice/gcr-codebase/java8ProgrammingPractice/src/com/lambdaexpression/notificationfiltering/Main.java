package com.lambdaexpression.notificationfiltering;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", "Heart rate critical"),
                new Alert("APPOINTMENT", "Doctor visit at 5 PM"),
                new Alert("LAB", "Blood test report ready"),
                new Alert("INFO", "Hospital closed on Sunday")
        );

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose alert filter:");
        System.out.println("1. Emergency alerts only");
        System.out.println("2. Appointment alerts only");
        System.out.println("3. Lab alerts only");
        System.out.println("4. Emergency + Lab alerts");
        System.out.println("5. Exclude Info alerts");
        System.out.println("6. Show all alerts");

        int choice = sc.nextInt();

        Predicate<Alert> filter = null;

        switch (choice) {

            case 1:
                filter = alert -> alert.type.equals("EMERGENCY");
                break;

            case 2:
                filter = alert -> alert.type.equals("APPOINTMENT");
                break;

            case 3:
                filter = alert -> alert.type.equals("LAB");
                break;

            case 4:
                Predicate<Alert> emergency = alert -> alert.type.equals("EMERGENCY");
                Predicate<Alert> lab = alert -> alert.type.equals("LAB");
                filter = emergency.or(lab);
                break;

            case 5:
                filter = alert -> !alert.type.equals("INFO");
                break;

            case 6:
                filter = alert -> true; // no filtering
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\nFiltered Alerts:");
        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);

        sc.close();
    }
}
