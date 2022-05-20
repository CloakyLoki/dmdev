package com.dmdev.homework.week3.StarSystem;

public class ArtificialSputnik extends Sputnik implements Inhabited {

    private final int year;
    private boolean isInhabited;

    public ArtificialSputnik(String name, double weight, double radius, double distanceFromSun, SpaceObject rotateAround, double orbit, int year, boolean isInhabited) {
        super(name, weight, radius, distanceFromSun, rotateAround, orbit);
        this.year = year;
        this.isInhabited = isInhabited;
    }

    @Override
    public void printInfo() {
        System.out.println("Год запуска" + year);
    }

    @Override
    public boolean isInhabited() {
        return isInhabited;
    }
}
