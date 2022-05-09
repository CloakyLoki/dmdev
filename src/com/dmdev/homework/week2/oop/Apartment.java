package com.dmdev.homework.week2.oop;

public class Apartment extends Residence {

    public Apartment(int number, Room[] rooms) {
        super(number, rooms);
    }

    @Override
    public void print() {
        System.out.println("      Квартира №" + getNumber() + " имеет " + getPrintables().length + " комнаты");
    }
}
