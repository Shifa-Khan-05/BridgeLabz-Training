package com.sortingalgorithms.flashdealz;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Products> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    // Partition method (Descending order by discount)
    private static int partition(List<Products> list, int low, int high) {

        double pivot = list.get(high).getDiscount();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).getDiscount() >= pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Products> list, int i, int j) {
        Products temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
