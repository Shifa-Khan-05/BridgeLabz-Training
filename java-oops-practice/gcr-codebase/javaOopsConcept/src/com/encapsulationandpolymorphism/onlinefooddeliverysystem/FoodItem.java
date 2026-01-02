package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public abstract class FoodItem implements Discountable {

    // Encapsulation: private fields
    private String itemName;
    private double price;
    private int quantity;

    protected FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // Protected access for subclasses
    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected String getItemName() {
        return itemName;
    }
}
