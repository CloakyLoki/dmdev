package com.dmdev.homework.week1;

/*
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class CountEvenOddNumbers {
    public static void main(String[] args) {

        int value = 120940;
        System.out.println("Количество четных цифр: " + countEvenNumbers(value));
        System.out.println("Количество нечетных цифр: " + countOddNumbers(value));
    }

    public static int countEvenNumbers(int value) {
        int evenNumbers = 0;
        int valueLength = 0;
        int tempCounter = 1;
        while (tempCounter <= value) { //определение количества разрядов числа
            valueLength++;
            tempCounter *= 10;
        }
        for (int i = 0; i < valueLength; i++) {
            if (((value % 10) % 2) == 0)
                evenNumbers++;
            value /= 10;
        }
        return evenNumbers;
    }

    public static int countOddNumbers(int value) {
        int oddNumbers = 0;
        int valueLength = 0;
        int tempCounter = 1;
        while (tempCounter <= value) { //определение количества разрядов числа
            valueLength++;
            tempCounter *= 10;
        }
        for (int i = 0; i < valueLength; i++) {
            if (((value % 10) % 2) != 0) //скобки добавлены для лучшей читаемости
                oddNumbers++;
            value /= 10;
        }
        return oddNumbers;
    }
}
