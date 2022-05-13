package com.dmdev.homework.week2.oop;

public class Building extends Residence {

    public Building(int number, Floor[] floors) {
        super(number, floors);
    }

    @Override
    public void print() {
        System.out.println("Номер дома: " + getNumber());
        System.out.println("Этажность: " + getPrintables().length);
    }
}
