package com.sortingalgorithms.medwarehouse;

import java.util.ArrayList;

/**
 * Warehouse class sorts medicines by expiry date using Merge Sort
 */
public class Warehouse {

    ArrayList<Meicines> medicines = new ArrayList<>();

    // Add medicine to list
    public void addMedicine(Meicines medicine) {
        medicines.add(medicine);
    }

    // Public method to start merge sort
    public void sortByExpiry() {
        if (medicines.size() > 1) {
            mergeSort(medicines);
        }
    }

    // Recursive merge sort
    private void mergeSort(ArrayList<Meicines> list) {

        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;

        ArrayList<Meicines> left =
                new ArrayList<>(list.subList(0, mid));
        ArrayList<Meicines> right =
                new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    // Merge two sorted sublists
    private void merge(ArrayList<Meicines> result,
                       ArrayList<Meicines> left,
                       ArrayList<Meicines> right) {

        int i = 0, j = 0, k = 0;

        // Merge based on expiry date
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getExpiryDate()
                    .isBefore(right.get(j).getExpiryDate())) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements
        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    // Display sorted medicines
    public void displayMedicines() {
        System.out.println("\nMedicines Sorted by Expiry Date:");
        for (Meicines medicine : medicines) {
            System.out.println(medicine);
        }
    }
}
