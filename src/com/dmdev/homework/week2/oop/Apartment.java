package com.dmdev.homework.week2.oop;

public class Apartment implements Printable {

    private Room[] rooms;
    private int number;

    Apartment(Room[] rooms, int number) {
        this.rooms = rooms;
        this.number = number;
    }

    @Override
    public void printOut() {
        System.out.println("Квартира №" + getNumber() + " имеет " + getRooms().length + " комнаты");
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
