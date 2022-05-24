package com.dmdev.homework.week3.starSystem;

public class Star extends SpaceObject {

    private final double temperature;

    public Star(String name, double weight, double radius, double distanceFromSun, double temperature) {
        super(name, weight, radius, distanceFromSun);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Наименование звезды: " + getName() +
                ", масса " + getWeight() + " кг" +
                ", диаметр " + getDiameter() + " км" +
                ", температура поверхности " + temperature + " K.";
    }
}
