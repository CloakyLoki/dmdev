package com.dmdev.homework.week5.studentsStreams;

import java.util.function.Function;

public enum Year {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private int year;

    Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

}
