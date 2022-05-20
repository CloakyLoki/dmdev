package com.dmdev.homework.week3.StarSystem;

public class Planet extends SpaceObject implements Satellite, Inhabited{

    private final SpaceObject centralObject;
    private final double orbit;
    private final boolean isInhabited;

    public Planet(String name, double weight, double radius, double distanceFromSun, SpaceObject centralObject, double orbit, boolean isInhabited) {
        super(name, weight, radius, distanceFromSun);
        this.centralObject = centralObject;
        this.orbit = orbit;
        this.isInhabited = isInhabited;
    }

    @Override
    public SpaceObject getRotatingAround() {
        return centralObject;
    }

    @Override
    public double getOrbit() {
        return orbit;
    }

    @Override
    public boolean isInhabited() {
        return isInhabited;
    }
}
