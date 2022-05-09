package com.dmdev.homework.week2.oop;
/*
Представить в виде классов и их композиции следующую модель.

- Каждый дом содержит свой номер (int), и множество этажей (массив).
- Каждый этаж содержит номер этажа (int), и множество квартир (массив).
- Каждая квартира содержит свой номер (int), и множество комнат (массив).
- Каждая комната содержит поле проходная она или нет (boolean).
В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
(должны присутствовать все поля объекта!).
Например, метод print класса этаж должен выводить на консоль:
“Этаж 2, количество квартир 18”
Создание всех объектов вынести в отдельный класс с методом main.
Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */
public class Inspector {


    public static void main(String[] args) {

        Room room0 = new Room(1,true);
        Room room1 = new Room(2, false);
        Room room2 = new Room(3, false);
        Room[] rooms0 = {room0, room1, room2};
        Room[] rooms1 = {room0, room1};

        Apartment apartment0 = new Apartment(1, rooms0);
        Apartment apartment1 = new Apartment(2, rooms1);
        Apartment[] apartments = {apartment0, apartment1};

        Floor floor0 = new Floor(1, apartments);
        Floor floor1 = new Floor(2, apartments);
        Floor[] floors = {floor0, floor1};

        Building building = new Building(1, floors);

        building.printAllInformation();


    }


}
