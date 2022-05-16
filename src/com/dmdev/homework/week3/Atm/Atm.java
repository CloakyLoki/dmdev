package com.dmdev.homework.week3.Atm;

/*
Создать класс, описывающий банкомат.

Банкомат задается тремя свойствами:
- количеством купюр номиналом 20, 50 и 100.
190 = 1 * 100 + 1*50 + 2*20
Сделать методы для добавления денег в банкомат.
Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Atm {
    private int note20;
    private int note50;
    private int note100;

    public Atm(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public boolean getCash(int moneyRequest) {
        int note20Counter = 0;
        int note50Counter = 0;
        int note100Counter = 0;
        int saveMoneyRequest = moneyRequest;

        while (moneyRequest >= note20) {
            if (moneyRequest >= 100 && note100 > 0) {
                note100Counter += moneyRequest / 100;
                moneyRequest %= 100;
            }
            if (moneyRequest >= 50 && note50 > 0) {
                note50Counter += moneyRequest / 50;
                moneyRequest %= 50;
            }
            if (moneyRequest >= 20 && note20 > 0) {
                note20Counter += moneyRequest / 20;
                moneyRequest %= 20;
            } else {
                System.out.println("Невозможно выдать сумму");
                return false;
            }
        }
        printNoteRating(saveMoneyRequest, note20Counter, note50Counter, note100Counter);
        return true;
    }

    private void printNoteRating(int moneyRequest, int note20Counter, int note50Counter, int note100Counter) {
        System.out.println("Запрошенная сумма " + moneyRequest + "$ выдана");
        System.out.println("Количество купюр по номиналам:");
        if (note20Counter != 0) {
            System.out.println("20$:  " + note20Counter);
        }
        if (note50Counter != 0) {
            System.out.println("50$:  " + note50Counter);
        }
        if (note100Counter != 0) {
            System.out.println("100$: " + note100Counter);
        }
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }
}
