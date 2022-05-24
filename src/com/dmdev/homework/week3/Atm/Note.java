package com.dmdev.homework.week3.Atm;

public enum Note {
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int rate;

    Note(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
