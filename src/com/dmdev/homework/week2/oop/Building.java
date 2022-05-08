package com.dmdev.homework.week2.oop;

public class Building implements Printable {

    private int number;
    private Floor[] floors;

    public Building(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public void printOut() {
        System.out.println("Номер дома: " + getNumber());
        System.out.println("Этажность: " + getFloors().length);

    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }


}
