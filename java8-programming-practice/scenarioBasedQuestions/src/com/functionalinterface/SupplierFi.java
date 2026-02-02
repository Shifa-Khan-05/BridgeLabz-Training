package com.functionalinterface;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFi {

    public static void main(String[] args) {

        // 1. Generate OTP using Supplier
        Supplier<Integer> generateOtp =
                () -> 100000 + new Random().nextInt(900000);

        System.out.println("Generated OTP: " + generateOtp.get());

        System.out.println("==============================================");

        // 2. Generate random student ID using Supplier
        Supplier<Integer> generateStudentId =
                () -> new Random().nextInt(10000);

        System.out.println("Student ID: " + generateStudentId.get());

        System.out.println("==============================================");

        // 3. Provide current date and time using Supplier
        Supplier<LocalDateTime> currentDateTime =
                LocalDateTime::now;

        System.out.println("Current Date & Time: " + currentDateTime.get());

        System.out.println("==============================================");

        // 4. Provide default welcome message using Supplier
        Supplier<String> welcomeMessage =
                () -> "Welcome to the application";

        System.out.println(welcomeMessage.get());

        System.out.println("==============================================");

        // 5. Generate random discount coupon using Supplier
        Supplier<String> discountCoupon =
                () -> "DISC" + new Random().nextInt(1000);

        System.out.println("Discount Coupon: " + discountCoupon.get());
    }
}
