package com.dmdev.homework.week1;
/*
Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
 */

public class TrianglesSquare {
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 1;

        int a2 = 3;
        int b2 = 2;

        compareTriangles(a1, b1, a2, b2);
    }

    public static double getSquare(int a, int b) {
        return (a * b) / 2;
    }

    public static void compareTriangles(int a1, int b1, int a2, int b2) {
        if (getSquare(a1, b1) > getSquare(a2, b2)) {
            System.out.println("Первый треугольник больше второго");
        } else if (getSquare(a1, b1) < getSquare(a2, b2)) {
            System.out.println("Первый треугольник меньше второго");
        } else {
            System.out.println("Первый треугольник равен второму");
        }
    }

}
