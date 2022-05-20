package com.dmdev.homework.week3.StarSystem;

public class Star extends SpaceObject{

    double temperature;

    public Star(String name, double weight, double radius, double distanceFromSun, double temperature) {
        super(name, weight, radius, distanceFromSun);
        this.temperature = temperature;
    }
}