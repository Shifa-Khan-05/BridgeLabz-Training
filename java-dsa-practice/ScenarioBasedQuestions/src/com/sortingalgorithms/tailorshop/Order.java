package com.sortingalgorithms.tailorshop;

/**
 * Represents a tailoring order
 */
public class Order {

    private String name;
    private int deadline; // delivery deadline (smaller value = earlier delivery)

    public Order(String name, int deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Order: " + name + " | Deadline: " + deadline;
    }
}
