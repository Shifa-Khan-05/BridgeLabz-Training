package com.sortingalgorithms.flashdealz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Products> products = new ArrayList<>();

        products.add(new Products(101, "Laptop", 40.0));
        products.add(new Products(102, "Mobile", 55.0));
        products.add(new Products(103, "Headphones", 30.0));
        products.add(new Products(104, "Smart Watch", 60.0));
        products.add(new Products(105, "Camera", 25.0));

        System.out.println("=== Before Sorting ===");
        products.forEach(System.out::println);

        QuickSort.quickSort(products, 0, products.size() - 1);

        System.out.println("\n=== After Sorting (Top Discounts First) ===");
        products.forEach(System.out::println);
    }
}
