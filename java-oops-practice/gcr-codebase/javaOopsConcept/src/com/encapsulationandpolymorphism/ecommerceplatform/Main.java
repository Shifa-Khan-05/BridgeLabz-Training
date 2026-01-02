package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.*;
public class Main {
	

	    public static void main(String[] args) {

	        List<Product> products = new ArrayList<>();

	        products.add(new Electronics(1, "Laptop", 60000));
	        products.add(new Clothing(2, "Jacket", 4000));
	        products.add(new Groceries(3, "Rice Bag", 1500));

	        // Polymorphism
	        for (Product product : products) {
	            product.finalPrice();
	        }
	    }
	

}
