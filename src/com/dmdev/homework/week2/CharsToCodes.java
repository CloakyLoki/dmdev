package com.dmdev.homework.week2;

/*
Дан одномерный массив символов.
Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]

Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
которые больше этого среднего арифметического.
 */
public class CharsToCodes {

    public static void main(String[] args) {

        char[] chars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
    printUpperNumbers(charToCode(chars));
    }
    private static int[] charToCode(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }

    private static void printUpperNumbers(int[] array) {
        int mean = 0;
        for (int number : array) {
            mean += number;
        }
        mean /= array.length;

        for (int number : array) {
            if(number > mean){
                System.out.print(number + " ");
            }

        }

    }


}

