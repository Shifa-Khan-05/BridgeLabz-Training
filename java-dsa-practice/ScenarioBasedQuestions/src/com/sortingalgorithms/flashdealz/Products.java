package com.sortingalgorithms.flashdealz;


public class Products {

    private int productId;
    private String name;
    private double discount;

    public Products(int productId, String name, double discount) {
        this.productId = productId;
        this.name = name;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return productId + " - " + name + " - " + discount + "%";
    }
}
