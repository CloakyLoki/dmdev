package com.dmdev.homework.week2;


/*
Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */
public class RemoveNegative {

    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};

        printArray(removeNegatives(array));

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

    private static int[] removeNegatives(int[] numbers) {
        int[] positiveArray = new int[countPositives(numbers)];
        int indexPositive = 0;
        for (int number : numbers) {
            if (number > 0) {
                positiveArray[indexPositive] = number * countPositives(numbers);
                indexPositive++;
            }
        }
        return positiveArray;
    }

    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }

    }
}
