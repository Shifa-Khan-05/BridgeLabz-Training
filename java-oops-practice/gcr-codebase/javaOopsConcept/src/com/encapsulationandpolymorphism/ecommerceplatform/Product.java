package com.encapsulationandpolymorphism.ecommerceplatform;

public abstract class Product implements Taxable {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public double getPrice() {
        return price;
    }

    // Abstract method
    abstract double calculateDiscount(double price);

    // Interface implementation
    @Override
    public double calculateTax(double price) {
        return price * 0.18;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax (18%): " + calculateTax(price));
    }

    // Polymorphic behavior
    public void finalPrice() {
        double tax = calculateTax(price);
        double discount = calculateDiscount(price);
        double finalAmount = price + tax - discount;

        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalAmount);
        System.out.println("-------------------------");
    }
}
