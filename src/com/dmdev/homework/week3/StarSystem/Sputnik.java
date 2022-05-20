package com.dmdev.homework.week3.StarSystem;

public abstract class Sputnik extends SpaceObject implements Satellite {

    private final SpaceObject rotateAround;
    private final double orbit;

    public Sputnik(String name, double weight, double radius, double distanceFromSun, SpaceObject rotateAround, double orbit) {
        super(name, weight, radius, distanceFromSun);
        this.rotateAround = rotateAround;
        this.orbit = orbit;
    }

    @Override
    public SpaceObject getRotatingAround() {
        return rotateAround;
    }

    @Override
    public double getOrbit() {
        return orbit;
    }

    public void printInfo() {
        System.out.println("Масса объекта " + getWeight());
    }
}
