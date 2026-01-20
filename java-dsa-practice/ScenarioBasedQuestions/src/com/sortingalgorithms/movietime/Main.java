package com.sortingalgorithms.movietime;

public class Main {

	    public static void main(String[] args) {

	        MovieTheater theater = new MovieTheater();

	        theater.addMovie(new Movie("Avatar", 600));      // 10:00
	        theater.addMovie(new Movie("Inception", 750));  // 12:30
	        theater.addMovie(new Movie("Interstellar", 690)); // 11:30
	        theater.addMovie(new Movie("Dune", 900));        // 15:00

	        theater.displayShows();
	    }
	

}
