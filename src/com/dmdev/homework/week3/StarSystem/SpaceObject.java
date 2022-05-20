package com.dmdev.homework.week3.StarSystem;

public abstract class SpaceObject {

    private final String name;
    private final double weight;
    private final double radius;
    private final double distanceFromSun;

    public SpaceObject(String name, double weight, double radius, double distanceFromSun) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void compareObjects(SpaceObject spaceObject) {
        if (getWeight() < spaceObject.getWeight()) {
            System.out.println("Объект " + spaceObject.getName() + " больше, чем " + getName());
        } else if (getWeight() > spaceObject.getWeight()) {
            System.out.println("Объект " + spaceObject.getName() + " меньше, чем " + getName());
        } else {
            System.out.println("Объект " + spaceObject.getName() + " равен " + getName());
        }
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
