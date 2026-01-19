package com.sortingalgorithms.fitnesstracker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "Asha", 8000));
        users.add(new User(2, "Ravi", 12000));
        users.add(new User(3, "Neha", 6000));
        users.add(new User(4, "Kiran", 10000));

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(users);

        System.out.println("=== Users Sorted by Steps ===");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
