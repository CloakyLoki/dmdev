package com.dmdev.homework.week1;
/*
Задание 1

В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.
 */

public class HourQuorter {

    final static short MINUTES_IN_HOUR = 60;

    public static void main(String[] args) {
        byte minutes = 42;
        byte numberOfSectors = 4; //Добавил от себя возможность выбора любого количества секторов циферблата (до 60)
        printQuorter(minutes, numberOfSectors);

    }

    public static void printQuorter(byte minutes, byte numberOfSectors) {
        if (numberOfSectors <= MINUTES_IN_HOUR) {
            for (int i = 1; i <= numberOfSectors; i++) {
                if (minutes <= MINUTES_IN_HOUR / numberOfSectors * i) {
                    System.out.println("Число попадает в сектор номер " + i);
                    break;
                }
            }
        } else
            System.out.println("Количество секторов не должно быть больше 60");

    }
}
