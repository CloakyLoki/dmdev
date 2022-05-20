package com.dmdev.homework.week3.Atm;

public class AtmRunner {

    public static void main(String[] args) {
        Atm atm = new Atm(1, 0, 0);
        atm.addNoteTwenty(4);
        atm.addNoteFifty(2);
        atm.addNoteHundred(1);
        atm.getCash(170);
    }
}
