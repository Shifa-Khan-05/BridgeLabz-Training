package com.streamapi.top5trendingmovies;

public class Movies {

	String name;
	double rating;
	int releaseYear;
	
	public Movies(String name, double rating,int releaseYear) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rating=rating;
		this.releaseYear=releaseYear;
	}
	public double getRating() {
        return rating;
    }
	
	public int getReleaseYear() {
        return releaseYear;
    }
	
	@Override
	public String toString() {
		return "Movie name :" + name + "|  Rating : " + rating + " |  Release Year : " + releaseYear;
	}
}
