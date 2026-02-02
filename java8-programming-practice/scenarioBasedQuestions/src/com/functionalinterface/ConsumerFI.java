package com.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Consumer;

public class ConsumerFI {

    public static void main(String[] args) {

        // 1. Print student details using Consumer
        Consumer<String> printStudentDetails =
                student -> System.out.println("Student Details: " + student);

        printStudentDetails.accept("Amit | CS | Rank: 15");

        System.out.println("==============================================");

        // 2. Log employee login activity using Consumer
        Consumer<String> logEmployeeLogin =
                emp -> System.out.println("Employee Login: " + emp +
                        " | Time: " + LocalDateTime.now());

        logEmployeeLogin.accept("Employee ID: E102");

        System.out.println("==============================================");

        // 3. Print order confirmation message using Consumer
        Consumer<String> orderConfirmation =
                orderId -> System.out.println(
                        "Order " + orderId + " has been placed successfully");

        orderConfirmation.accept("ORD78945");

        System.out.println("==============================================");

        // 4. Display account balance using Consumer
        Consumer<Double> displayBalance =
                balance -> System.out.println("Available Balance: ₹" + balance);

        displayBalance.accept(45230.75);

        System.out.println("==============================================");

        // 5. Send notification message using Consumer
        Consumer<String> sendNotification =
                message -> System.out.println("Notification Sent: " + message);

        sendNotification.accept("Your profile has been updated successfully");
    }
}
