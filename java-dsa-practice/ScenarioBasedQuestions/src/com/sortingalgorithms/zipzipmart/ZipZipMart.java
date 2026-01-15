package com.sortingalgorithms.zipzipmart;

import java.time.LocalDate;
import java.util.*;

public class ZipZipMart {

    public static void mergeSort(List<Transaction> list) {
        if (list.size() <= 1)
            return;

        int mid = list.size() / 2;

        List<Transaction> left = new ArrayList<>(list.subList(0, mid));
        List<Transaction> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private static void merge(List<Transaction> result,
                              List<Transaction> left,
                              List<Transaction> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {

            int dateCompare = left.get(i).date.compareTo(right.get(j).date);

           
            if (dateCompare < 0 ||
               (dateCompare == 0 &&
                left.get(i).amount <= right.get(j).amount)) {

                result.set(k++, left.get(i++)); 
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size())
            result.set(k++, left.get(i++));

        while (j < right.size())
            result.set(k++, right.get(j++));
    }

    public static void main(String[] args) {

       
        List<Transaction> list = new ArrayList<>();

        list.add(new Transaction(LocalDate.of(2025, 1, 1), 23456));
        list.add(new Transaction(LocalDate.of(2025, 1, 1), 18000));
        list.add(new Transaction(LocalDate.of(2025, 1, 2), 23456));
        list.add(new Transaction(LocalDate.of(2025, 1, 5), 12000));
        list.add(new Transaction(LocalDate.of(2025, 1, 10), 5000));

        mergeSort(list);

        list.forEach(System.out::println);
    }
}
