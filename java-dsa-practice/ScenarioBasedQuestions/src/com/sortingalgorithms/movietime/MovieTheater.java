package com.sortingalgorithms.movietime;

import java.util.*;
public class MovieTheater {

	    private ArrayList<Movie> movies = new ArrayList<>();

	    // Add movie using Insertion Sort logic
	    public void addMovie(Movie newMovie) {

	        int i = movies.size() - 1;

	        // Shift movies until correct position is found
	        while (i >= 0 && movies.get(i).getShowTime() > newMovie.getShowTime()) {
	            i--;
	        }

	        movies.add(i + 1, newMovie); // Insert at correct position
	        System.out.println("Added: " + newMovie);
	    }

	    // Display all movie shows
	    public void displayShows() {
	        System.out.println("\n Movie Show Listings:");
	        for (Movie movie : movies) {
	            System.out.println(movie);
	        }
	    }
	}
