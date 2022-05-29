package com.dmdev.homework.week4.cinema;

import com.dmdev.homework.week4.cinema.util.Genre;
import com.dmdev.homework.week4.cinema.util.Month;
import com.dmdev.homework.week4.cinema.util.RatingComparator;
import java.util.*;

public class Cinema {

    private Map<Integer, List<Movie>> movieCollection = new TreeMap<>();

    public void addMovie(Movie movie) {
        Integer year = movie.getYearOfOrigin();
        List<Movie> bucket = getMoviesByYear(year); //временное хранилище просто для облегчения чтения кода
        bucket.add(movie);
        movieCollection.put(year, bucket);
    }

    public List<Movie> getMoviesByYear(Integer year) {

        if (movieCollection.containsKey(year)) {
            return movieCollection.get(year);
        } else {
            return new ArrayList<>();
        }
    }

    public List<Movie> getMoviesByYearMonth(Integer year, Month month) {
        List<Movie> completeMovieList = getAllMovies();
        List<Movie> result = new LinkedList<>();
        for (Movie movie : completeMovieList) {
            if (movie.getYearOfOrigin() == year && movie.getMonthOfOrigin() == month){
                result.add(movie);
            }
        }
        if(result.isEmpty()){
            return new ArrayList<>(0);
        } else {
            return result;
        }
    }

    public List<Movie> getMoviesByGenre(Genre genre) {
        List<Movie> result = new ArrayList<>();
        for (List<Movie> value : movieCollection.values()) {
            for (Movie movie : value) {
                if (movie.getGenre() == genre) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public List<Movie> getTopMovies() {
        int topMoviesNumber = 5; //в задании нужно вывести Топ-10, 5 фильмов выбрано просто для того, чтобы не заводить большое количество фильмов
        List<Movie> topList = new ArrayList<>(topMoviesNumber);
        List<Movie> completeMovieList = getAllMovies();
        completeMovieList.sort(new RatingComparator()); //сортировка общего списка по убыванию рейтинга
        for (int i = 0; i < topMoviesNumber; i++) {
            topList.add(completeMovieList.get(i)); //выборка нужного количества топовых фильмов
        }
        return topList;
    }

    private List<Movie> getAllMovies() {
        List<Movie> completeMovieList = new LinkedList<>();
        for (List<Movie> value : movieCollection.values()) {
            completeMovieList.addAll(value);
        }
        return completeMovieList;
    }
}