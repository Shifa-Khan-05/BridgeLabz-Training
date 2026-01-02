package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order);
    }

    // Polymorphic method
    public static void processOrder(List<FoodItem> items) {

        double finalBill = 0;

        for (FoodItem item : items) {
            item.getItemDetails();
            item.getDiscountDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = item.applyDiscount();

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + (totalPrice - discount));
            System.out.println("---------------------------");

            finalBill += (totalPrice - discount);
        }

        System.out.println("Total Bill Amount: " + finalBill);
    }
}