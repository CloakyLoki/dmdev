package com.dmdev.homework.week2.oop;

public abstract class Residence implements Printable {

    protected final int number;
    protected Printable[] printables = new Printable[0];


    public Residence(int number, Printable[] printables) {
        this.number = number;
        this.printables = printables;
    }

    public Residence(int number) { //конструктор для Room, который уже не содержит в себе массив
        this.number = number;
    }

    public void printAllInformation() {
        print(); //вывод информации о себе

        for (Printable printable : printables) { //вывод информации о наследующих классах
            printable.printAllInformation();
        }
    }
    public int getNumber() {
        return number;
    }

    public Printable[] getPrintables() {
        return printables;
    }
}

