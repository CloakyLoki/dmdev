package com.dmdev.homework.week4.cinema;

import com.dmdev.homework.week4.cinema.util.Genre;
import com.dmdev.homework.week4.cinema.util.Month;

public class Movie {

    private int id;
    private String name; //в задании этого поля не было, но решил добавить
    private int yearOfOrigin;
    private Month monthOfOrigin;
    private Genre genre;
    private int rating;

    public Movie(int id, String name, int yearOfOrigin, Month monthOfOrigin, Genre genre, int rating) {
        this.id = id;
        this.name = name;
        this.yearOfOrigin = yearOfOrigin;
        this.monthOfOrigin = monthOfOrigin;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }

    public Month getMonthOfOrigin() {
        return monthOfOrigin;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Фильм {" +
                "id=" + id +
                ", Название='" + name + '\'' +
                ", Год выхода=" + yearOfOrigin +
                ", Месяц выхода=" + monthOfOrigin.getName() +
                ", Жанр=" + genre.getName() +
                ", Рейтинг=" + rating +
                '}' + '\n';
    }
}