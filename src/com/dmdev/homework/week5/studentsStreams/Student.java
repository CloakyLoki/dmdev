package com.dmdev.homework.week5.studentsStreams;

import java.util.List;

public class Student {

    private String name;
    private String surname;
    private Year year;
    private List<Integer> grades;

    public Student(String name, String surname, Year year, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Year getYear() {
        return year;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", grades=" + grades +
                '}';
    }
}
