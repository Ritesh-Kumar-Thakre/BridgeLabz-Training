package com.streamapiproblems.streamapi.top5trendingmovies;

import java.time.LocalDate;
import java.util.*;

public class Top5Movies {
	public static void main(String[] args) {

		Movie m1 = new Movie("Dhurandar", LocalDate.of(2025, 11, 01), 8.7);
		Movie m2 = new Movie("KGF", LocalDate.of(2022, 9, 8), 8.6);
		Movie m3 = new Movie("Avangers: Civil War", LocalDate.of(2012, 03, 9), 9.7);
		Movie m4 = new Movie("Avengers: Infinity War", LocalDate.of(2018, 07, 27), 9.2);
		Movie m5 = new Movie("Avengers: EndGame", LocalDate.of(2019, 07, 26), 9.8);
		Movie m6 = new Movie("Avengers: Age of altron", LocalDate.of(2015, 1, 11), 9.4);
		Movie m7 = new Movie("Avengers: Secrate Wars", LocalDate.of(2026, 12, 26), 9.9);

		List<Movie> movieList = Arrays.asList(m1, m2, m3, m4, m5, m6, m7);

		movieList.stream().filter(e -> e.releseDate.getYear() < 2024).filter(e -> e.rating > 9.0).limit(5)
				.forEach(System.out::println);
	}
}
