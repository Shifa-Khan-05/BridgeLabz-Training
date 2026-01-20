package com.sortingalgorithms.gamerzone;

public class GameSorter {

    // Quick Sort method
    public static void quickSort(Players[] players, int low, int high) {
        if (low < high) {

            // Partition index
            int pivotIndex = partition(players, low, high);

            // Sort elements before and after partition
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    // Partition logic for Quick Sort
    private static int partition(Players[] players, int low, int high) {

        // Choose last element as pivot
        int pivotScore = players[high].getScores();
        int i = low - 1;

        // Rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            // Descending order (higher score first)
            if (players[j].getScores() > pivotScore) {
                i++;
                swap(players, i, j);
            }
        }

        // Place pivot at correct position
        swap(players, i + 1, high);
        return i + 1;
    }

    // Utility method to swap players
    private static void swap(Players[] players, int i, int j) {
        Players temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

    // Display leaderboard
    private static void display(Players[] players) {
        for (Players p : players) {
            System.out.println(p);
        }
    }

    // Main method (Simulation)
    public static void main(String[] args) {

        Players[] players = {
            new Players("Abhay", 450),
            new Players("Riya", 780),
            new Players("Arjun", 600),
            new Players("Sneha", 900),
            new Players("Kunal", 720)
        };

        System.out.println("Before Sorting:");
        display(players);

        quickSort(players, 0, players.length - 1);

        System.out.println("\nLeaderboard (After Quick Sort):");
        display(players);
    }
}
