package com.streamapi.top5trendingmovies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Top5TrendingMovies {

	public static void main(String[] args) {

		List<Movies> movies = new ArrayList<Movies>();
		movies.add(new Movies("ABC", 4.0, 2005));
		movies.add(new Movies("SDFC", 5.0, 2002));
		movies.add(new Movies("CVBC", 3.0, 2001));
		movies.add(new Movies("HJKC", 4.5, 2006));
		movies.add(new Movies("LMNO", 4.8, 2022));
		movies.add(new Movies("PQRS", 4.2, 2023));
		
		// Stream pipeline
        List<Movies> top5TrendingMovies =
                movies.stream()
                      // filter high-rated movies
                      .filter(movie -> movie.getRating() >= 4.0)

                      //  sort by rating DESC, then by release year DESC
                      .sorted(
                          Comparator.comparingDouble(Movies::getRating)
                                    .reversed()
                                    .thenComparing(Movies::getReleaseYear,
                                                   Comparator.reverseOrder())
                      )

                      // take top 5
                      .limit(5)

                      // collect result
                      .collect(Collectors.toList());

        System.out.println("Top 5 Trending Movies:");
        top5TrendingMovies.forEach(System.out::println);
    }
}