package com.dmdev.homework.week2.oop;

class Floor implements Printable {

    private final int number;
    private final Apartment[] apartments;

    public Apartment[] getApartments() {
        return apartments;
    }

    public Floor(int number, Apartment[] apartments) {
        //super();
        this.number = number;
        this.apartments = apartments;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public void printOut() {
        System.out.println("Номер этажа: " + getNumber());
        System.out.println("Квартир на этаже: " + getApartments().length);
    }
}
