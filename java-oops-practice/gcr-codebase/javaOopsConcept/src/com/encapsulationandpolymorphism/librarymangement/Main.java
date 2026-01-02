package com.encapsulationandpolymorphism.librarymangement;

import java.util.*;
public class Main {
	public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Clean Code", "Robert C. Martin"));
        items.add(new Magazine(2, "Time", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            item.reserveItem("Shifa");
            System.out.println("---------------------------");
        }
    }
}
