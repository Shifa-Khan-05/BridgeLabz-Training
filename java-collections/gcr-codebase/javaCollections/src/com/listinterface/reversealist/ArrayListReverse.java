package com.listinterface.reversealist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse {

    public static void reverseArrayList(List<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            // Swap elements
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        reverseArrayList(arrayList);
        System.out.println(arrayList);
    }
}
