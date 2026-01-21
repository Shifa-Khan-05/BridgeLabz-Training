package com.sortingalgorithms.tailorshop;

import java.util.ArrayList;

/**
 * Maintains orders sorted by delivery deadline
 * Uses Insertion Sort logic for real-time updates
 */
public class TailorShop {

    ArrayList<Order> orders = new ArrayList<>();

    /**
     * Inserts a new order into the correct position
     * based on deadline using Insertion Sort technique
     */
    void addOrders(Order newOrder) {

        int i = orders.size() - 1;

        // Shift position until correct place is found
        while (i >= 0 && orders.get(i).getDeadline() > newOrder.getDeadline()) {
            i--;
        }

        // Insert order at correct position
        orders.add(i + 1, newOrder);

        System.out.println("Order added successfully: " + newOrder);
    }

    /**
     * Displays all orders in sorted order
     */
    void displayDetails() {
        System.out.println("\nOrder List (Sorted by Deadline):");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
