package com.listinterface;

import java.util.LinkedList;
import java.util.List;

public class RotateElements {

    public static void rotateElements(List<Integer> list, int pos) {
        int size = list.size();
        pos = pos % size; // handles rotation > size

        for (int i = 0; i < pos; i++) {
            int first = list.get(0);

            for (int j = 0; j < size - 1; j++) {
                list.set(j, list.get(j + 1));
            }

            list.set(size - 1, first);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before Rotation: " + list);
        rotateElements(list, 2);
        System.out.println("After Rotation: " + list);
    }
}
