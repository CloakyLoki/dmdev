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
    private int noteTwentyQuantity;
    private int noteFiftyQuantity;
    private int noteHundredQuantity;

    public Atm(int noteTwentyQuantity, int noteFiftyQuantity, int noteHundredQuantity) {
        this.noteTwentyQuantity = noteTwentyQuantity;
        this.noteFiftyQuantity = noteFiftyQuantity;
        this.noteHundredQuantity = noteHundredQuantity;
    }

    public boolean getCash(int moneyRequest) {
        int noteTwentyCounter = 0;
        int noteFiftyCounter = 0;
        int noteHundredCounter = 0;
        int moneyLeftToGive = moneyRequest; //сохранение изначального значения запрошенной суммы для последующего вывода в консоль

        if (moneyRequest <= 0) {
            System.out.println("Пожалуйста, введите корректную сумму для выдачи");
            return false;
        }
        if (moneyLeftToGive >= Note.HUNDRED.getRate() && noteHundredQuantity > 0) {
            noteHundredCounter = countNote(moneyLeftToGive, Note.HUNDRED);
            moneyLeftToGive %= Note.HUNDRED.getRate();
        }
        if (moneyLeftToGive >= Note.FIFTY.getRate() && noteFiftyQuantity > 0) {
            noteFiftyCounter = countNote(moneyLeftToGive, Note.FIFTY);
            moneyLeftToGive %= Note.FIFTY.getRate();
        }
        if (moneyLeftToGive >= Note.TWENTY.getRate() && noteTwentyQuantity > 0) {
            noteTwentyCounter = countNote(moneyLeftToGive, Note.TWENTY);
            moneyLeftToGive %= Note.TWENTY.getRate();
        }
        if (moneyLeftToGive != 0) {
            System.out.println("Невозможно выдать сумму имеющимися банкнотами. Добавьте банкноты");
            return false;
        }
        printNoteQuantities(moneyRequest, noteTwentyCounter, noteFiftyCounter, noteHundredCounter);
        return true;
    }

    private int countNote(int moneyLeftToGive, Note note) {
        return moneyLeftToGive / note.getRate();
    }

    private void printNoteQuantities(int moneyRequest, int noteTwentyCounter, int noteFiftyCounter, int noteHundredCounter) {
        System.out.println("Запрошенная сумма " + moneyRequest + "$ выдана.");
        System.out.println("Номиналы купюр:");
        if (noteTwentyCounter != 0) {
            System.out.println("20$:  " + noteTwentyCounter + " шт.");
        }
        if (noteFiftyCounter != 0) {
            System.out.println("50$:  " + noteFiftyCounter + " шт.");
        }
        if (noteHundredCounter != 0) {
            System.out.println("100$: " + noteHundredCounter + " шт.");
        }
    }

    public void addNoteTwenty(int noteTwentyQuantity) {
        this.noteTwentyQuantity += noteTwentyQuantity;
    }

    public void addNoteFifty(int noteFiftyQuantity) {
        this.noteFiftyQuantity += noteFiftyQuantity;
    }

    public void addNoteHundred(int noteHundredQuantity) {
        this.noteHundredQuantity += noteHundredQuantity;
    }
}