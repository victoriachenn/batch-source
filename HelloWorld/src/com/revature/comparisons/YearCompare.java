package com.revature.comparisons;

import java.util.Comparator;

import com.revature.media.Movie;

public class YearCompare implements Comparator<Movie>{
	
	public YearCompare() {
		super();
	}
	public int compare(Movie m1, Movie m2) {
		Integer year1 = m1.getYearPublished();
		return year1.compareTo(m2.getYearPublished());
	}

}
