package com.lambdaexpression.customsortinfecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Sort by price (Low → High)
    public void sortByPrice(List<Product> products) {
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("List is sorted by price.....");
    }

    // Sort by rating (High → Low)
    public void sortByRating(List<Product> products) {
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("List is sorted by rating.....");

    }

    // Sort by discount (High → Low)
    public void sortByDiscount(List<Product> products) {
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("List is sorted by discount.....");

    }

    // Display products
    public void display(List<Product> products) {
        products.forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.2, 20));
        products.add(new Product("Headphones", 2000, 4.8, 30));

        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose sorting option:");
        System.out.println("1. Sort by Price (Low to High)");
        System.out.println("2. Sort by Rating (High to Low)");
        System.out.println("3. Sort by Discount (High to Low)");
        System.out.println("4. Display Product List");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                m.sortByPrice(products);
                break;

            case 2:
                m.sortByRating(products);
                break;

            case 3:
                m.sortByDiscount(products);
                break;

            case 4:
                m.display(products);
                sc.close();
                return;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("\nSorted Product List:");
       
        sc.close();
    }
}
