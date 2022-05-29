package com.dmdev.homework.week4.cinema;

import com.dmdev.homework.week4.cinema.util.Genre;
import com.dmdev.homework.week4.cinema.util.Month;

public class CinemaRunner {

    public static void main(String[] args) {

        Movie greenMile = new Movie(1, "Зеленая миля", 1999, Month.DECEMBER, Genre.DRAMA, 15683);
        Movie shindlersList = new Movie(2, "Список Шиндлера", 1993, Month.JUNE, Genre.DRAMA, 11430);
        Movie shawshenk = new Movie(3, "Побег из Шоушенка", 1994, Month.APRIL, Genre.DRAMA, 11891);
        Movie returnKing = new Movie(4, "Властелин колец: Возвращение короля", 2003, Month.DECEMBER, Genre.FANTASY, 15683);
        Movie darkKnight = new Movie(5, "Тёмный рыцарь", 2008, Month.OCTOBER, Genre.ACTION, 20389);
        Movie walle = new Movie(6, "ВАЛЛ-И", 2008, Month.OCTOBER, Genre.CARTOON, 15754);
        Movie inception = new Movie(7, "Начало", 2010, Month.NOVEMBER, Genre.FICTION, 14213);
        Movie fightClub = new Movie(8, "Бойцовский клуб", 1999, Month.JANUARY, Genre.THRILLER, 13427);
        Movie operationY = new Movie(9, "Операция Ы", 1965, Month.JULY, Genre.COMEDY, 10258);

        Cinema cinemaPark = new Cinema();
        cinemaPark.addMovie(darkKnight);
        cinemaPark.addMovie(inception);
        cinemaPark.addMovie(greenMile);
        cinemaPark.addMovie(shawshenk);
        cinemaPark.addMovie(shindlersList);
        cinemaPark.addMovie(returnKing);
        cinemaPark.addMovie(fightClub);
        cinemaPark.addMovie(operationY);
        cinemaPark.addMovie(walle);

        System.out.println(cinemaPark.getMoviesByYear(1999));
        System.out.println(cinemaPark.getMoviesByYearMonth(2008, Month.OCTOBER));
        System.out.println(cinemaPark.getMoviesByGenre(Genre.CARTOON));
        System.out.println(cinemaPark.getTopMovies());
    }
}