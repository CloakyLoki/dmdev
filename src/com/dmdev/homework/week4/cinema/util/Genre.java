package com.dmdev.homework.week4.cinema.util;

public enum Genre {
    ACTION("Боевик"),
    DRAMA("Драма"),
    FANTASY("Фэнтези"),
    COMEDY("Комедия"),
    FICTION("Фантастика"),
    CARTOON("Мультфильм"),
    THRILLER("Триллер");

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
