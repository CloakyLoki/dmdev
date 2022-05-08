package com.dmdev.homework.week2.oop;

public class Room implements Printable {

    private boolean isPassage;

    Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    @Override
    public void printOut() {
        if (isPassage) {
            System.out.println("Проходная комната");
        } else {
            System.out.println("Комната непроходная");
        }
    }

    public boolean isPassage() {
        return isPassage;
    }

    public void setPassage(boolean passage) {
        isPassage = passage;
    }


}
