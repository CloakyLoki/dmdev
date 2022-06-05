package com.dmdev.homework.week5.studentsStreams;

public class StudentBasic{

    private String name;
    private String surname;


    public StudentBasic(String name, String surname) {
        this.name = name;
        this.surname = surname;
         }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "StudentBasic{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
