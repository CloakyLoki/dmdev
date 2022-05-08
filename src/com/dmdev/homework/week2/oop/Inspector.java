package com.dmdev.homework.week2.oop;

public class Inspector {


    public static void main(String[] args) {

        Room room0 = new Room(true);
        Room room1 = new Room(false);
        Room room2 = new Room(false);
        Room[] rooms0 = {room0, room1, room2};
        Room[] rooms1 = {room0, room1};

        Apartment apartment0 = new Apartment(rooms0, 12);
        Apartment apartment1 = new Apartment(rooms1, 13);
        Apartment[] apartments = {apartment0, apartment1};

        Floor floor0 = new Floor(1, apartments);
        Floor floor1 = new Floor(2, apartments);
        Floor[] floors = {floor0, floor1};

        Building building = new Building(2, floors);

        printAllInformation(building);

    }

    public static void printAllInformation(Building building) {

        building.printOut();
        Floor[] floors = building.getFloors();
        for (Floor floor : floors) {
            Apartment[] apartments = floor.getApartments();
            floor.printOut();
            for (Apartment apartment : apartments) {
                Room[] rooms = apartment.getRooms();
                apartment.printOut();
                for (Room room : rooms) {
                    room.printOut();
                }
            }
        }


    }
}
