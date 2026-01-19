package com.sortingalgorithms.fitnesstracker;

import java.util.List;

public class BubbleSort {

    public void bubbleSort(List<User> users) {

        int n = users.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare using steps
                if (users.get(j).getSteps() > users.get(j + 1).getSteps()) {

                    // Swap users
                    User temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
    }
}
