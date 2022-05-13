package com.dmdev.homework.week2.arrays;
/*
Дан одномерный массив целых чисел.

Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными
и только нули.
Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
Возвращает функция эти три массива в виде одного двумерного.
 */


public class SplitArray {

    public static void main(String[] args) {

        int[] numbers = {-4, 1, 9, 0, -18, -5, -2, 3};
        printArray(fillResultArray(numbers));
    }

    //Создание итогового массива
    private static int[][] createResultArray(int[] numbers) {

        int qPositive = 0;
        int qNegative = 0;
        int qZeros = 0;
        for (int value : numbers) {
            if (value > 0) {
                qPositive++;
            } else if (value < 0) {
                qNegative++;
            } else {
                qZeros++;
            }
        }

        int[][] resultArray = new int[3][];
        resultArray[0] = new int[qPositive];
        resultArray[1] = new int[qNegative];
        resultArray[2] = new int[qZeros];

        return resultArray;
    }

    //Заполнение значениями итогового массива
    private static int[][] fillResultArray(int[] numbers) {

        int[][] resultArray = createResultArray(numbers);

        int iPositive = 0;
        int iNegative = 0;
        int iZeros = 0;

        for (int number : numbers) {
            if (number > 0) {
                resultArray[0][iPositive] = number;
                iPositive++;
            } else if (number < 0) {
                resultArray[1][iNegative] = number;
                iNegative++;
            } else {
                resultArray[2][iZeros] = number;
                iZeros++;
            }
        }
        return resultArray;
    }

    private static void printArray(int[][] array) {

        for (int[] line : array) {
            System.out.print("[");
            for (int value : line) {
                System.out.print(value + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
