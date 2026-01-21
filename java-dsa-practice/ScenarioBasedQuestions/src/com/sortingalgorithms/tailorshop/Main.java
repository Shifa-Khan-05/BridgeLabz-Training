package com.sortingalgorithms.tailorshop;

public class Main {

    public static void main(String[] args) {

        TailorShop shop = new TailorShop();

        shop.addOrders(new Order("Shirt", 5));
        shop.addOrders(new Order("Suit", 2));
        shop.addOrders(new Order("Kurta", 4));
        shop.addOrders(new Order("Blazer", 1));

        shop.displayDetails();
    }
}
