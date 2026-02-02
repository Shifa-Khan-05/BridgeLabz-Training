package com.lambdaexpression.ecommerce;

import java.util.*;
import java.util.function.*;
public class ShoppingLambdaDemo {
	public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", 60000),
                new Product("Mouse", 400),
                new Product("Phone", 30000)
        );

        // 1. Apply 10% discount
        Function<Double, Double> discount = p -> p * 0.9;
        products.forEach(p ->
                System.out.println(p.name + " Discounted Price: " +
                        discount.apply(p.price))
        );

        System.out.println("================================");

        // 2. Sort products by price
        products.stream()
                .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(p -> System.out.println(p.name + " " + p.price));

        System.out.println("================================");

        // 3. Free delivery eligibility
        Predicate<Double> freeDelivery = amount -> amount > 500;
        products.forEach(p ->
                System.out.println(p.name + " Free Delivery: " +
                        freeDelivery.test(p.price))
        );

        System.out.println("================================");

        // 4. Final bill amount (price + 18% GST)
        Function<Double, Double> finalBill =
                p -> p + (p * 0.18);

        products.forEach(p ->
                System.out.println(p.name + " Final Bill: " +
                        finalBill.apply(p.price))
        );

        System.out.println("================================");

        // 5. Print product names
        products.forEach(p -> System.out.println(p.name));
    }
}
