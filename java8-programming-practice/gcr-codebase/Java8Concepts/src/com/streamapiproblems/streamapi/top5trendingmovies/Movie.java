package com.streamapiproblems.streamapi.top5trendingmovies;

import java.time.LocalDate;

public class Movie {
	protected String name;
	protected LocalDate releseDate;
	protected double rating;

	public Movie(String name, LocalDate releseDate, double rating) {
		this.name = name;
		this.releseDate = releseDate;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return name + " | " + releseDate + " | " + rating;
	}

}
