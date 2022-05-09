package com.dmdev.homework.week2.oop;

class Floor extends Residence {

    public Floor(int number, Apartment[] apartments) {
        super(number, apartments);
    }

    @Override
    public void print() {
        System.out.println("   Номер этажа: " + getNumber());
        System.out.println("   Квартир на этаже: " + getPrintables().length);
    }
}
