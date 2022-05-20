package com.dmdev.homework.week3.StarSystem;

public class NaturalSputnik extends Sputnik{

    public NaturalSputnik(String name, double weight, double radius, double distanceFromSun, SpaceObject rotateAround, double orbit) {
        super(name, weight, radius, distanceFromSun, rotateAround, orbit);
    }

    @Override
    public void printInfo(){
        System.out.println("Масса объекта");
    }


}
