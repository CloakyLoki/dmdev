package com.dmdev.homework.week3.Atm;

public class AtmRunner {

    public static void main(String[] args) {
        Atm atm = new Atm(5, 2, 1);
        atm.setNote100(2);
        atm.getCash(175);
    }
}
