package com.dmdev.homework.week4.cinema.util;

import com.dmdev.homework.week4.cinema.Movie;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie2.getRating() - movie1.getRating();
    }
}
