package com.sortingalgorithms.artexpo;
import java.util.*;
public class ArtExpo {
	/**
     * Sorts artists based on registration time using Insertion Sort.
     * This works well for real-time and nearly sorted data.
     */
    public static void insertionSort(ArrayList<Artist> artists) {

        // Start from the second artist
        for (int i = 1; i < artists.size(); i++) {

            // Artist to be placed at the correct position
            Artist key = artists.get(i);
            int j = i - 1;

            /*
             * Shift artists who registered later than 'key'
             * one position to the right
             */
            while (j >= 0 &&
                   artists.get(j).getRegistrationTime()
                           .isAfter(key.getRegistrationTime())) {

                artists.set(j + 1, artists.get(j));
                j--;
            }

            // Insert artist at correct position
            artists.set(j + 1, key);
        }
    }

    public static void main(String[] args) {

        ArrayList<Artist> artists = new ArrayList<>();

        // Artists registering throughout the day
        artists.add(new Artist("Alice", "10:30"));
        artists.add(new Artist("Bob", "09:45"));
        artists.add(new Artist("Charlie", "11:15"));
        artists.add(new Artist("Diana", "10:00"));

        // Sort artists by registration time
        insertionSort(artists);

        System.out.println("Artists sorted by registration time:");
        for (Artist a : artists) {
            System.out.println(a);
        }
  
}
}
