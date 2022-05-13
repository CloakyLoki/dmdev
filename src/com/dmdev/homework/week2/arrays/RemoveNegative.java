package com.dmdev.homework.week2.arrays;


import java.util.Arrays;

/*
Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class RemoveNegative {

    public static void main(String[] args) {

        int[] array = {3, 0, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(removeNegatives(array)));
    }

    private static int[] removeNegatives(int[] numbers) {

        int[] positiveArray = new int[countPositives(numbers)];
        int indexPositive = 0;
        for (int number : numbers) {
            if (number >= 0) {
                positiveArray[indexPositive] = number * countPositives(numbers); //можно заменить на positiveArray.length
                indexPositive++;
            }
        }
        return positiveArray;
    }

    //расчет длины итогового массива
    private static int countPositives(int[] numbers) {

        int counter = 0;
        for (int number : numbers) {
            if (number >= 0) {
                counter++;
            }
        }
        return counter;
    }
}
