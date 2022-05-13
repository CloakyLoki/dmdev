package com.dmdev.homework.week2.oop;

public class Room extends Residence {

    boolean isPassage;

    public Room(int number, boolean isPassage) {
        super(number);
        this.isPassage = isPassage;
    }

    @Override
    public void print() {
        if (isPassage()) {
            System.out.println("         Комната проходная");
        } else {
            System.out.println("         Комната непроходная");
        }
    }

    public boolean isPassage() {
        return isPassage;
    }
}
