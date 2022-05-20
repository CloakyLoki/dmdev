package com.dmdev.homework.week3.StarSystem;

public class Planet extends SpaceObject implements Satellite, Inhabited{

    private final SpaceObject centralObject;
    private final double orbit;
    private final boolean isInhabited;

    public Planet(String name, double weight, double radius, double distanceFromSun,
                  SpaceObject centralObject, double orbit, boolean isInhabited) {
        super(name, weight, radius, distanceFromSun);
        this.centralObject = centralObject;
        this.orbit = orbit;
        this.isInhabited = isInhabited;
    }

    @Override
    public SpaceObject rotationPoint() {
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

    @Override
    public String toString(){
        String inhabitant;
        if(isInhabited){
           inhabitant = "Обитаемая";
        } else {
            inhabitant = "Необитаемая";
        }

        return inhabitant + " планета " + getName() +
                ": Масса " + getWeight() + " кг" +
                ", диаметр " + getDiameter() + " км" +
                ", удаленность от Солнца " + getDistanceFromSun() + " млн км" +
                ". Находится на орбите" + orbit + " млн км" +
                " объекта " + centralObject;
    }
}
