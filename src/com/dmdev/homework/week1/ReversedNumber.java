package com.dmdev.homework.week1;

/*
Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 */
public class ReversedNumber {

    public static void main(String[] args) {
        int value = 47001;
        System.out.println(reverseValue(value));
    }

    private static int reverseValue(int value) {
        int reversedValue = 0;

        int valueLength = 0;
        int tempCounter = 1;

        while (tempCounter <= value) {
            valueLength++;
            tempCounter *= 10;
        }

        for (int i = 0; i < valueLength; i++) {
            reversedValue += (value % 10) * Math.pow(10, valueLength - i - 1);
            value /= 10;
        }
        return reversedValue;
    }
}
