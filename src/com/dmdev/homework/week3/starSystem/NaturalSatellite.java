package com.dmdev.homework.week3.starSystem;

public class NaturalSatellite extends Companion {

    public NaturalSatellite(String name, double weight, double radius,
                            double distanceFromSun, SpaceObject rotateAround, double orbit) {
        super(name, weight, radius, distanceFromSun, rotateAround, orbit);
    }

    @Override
    public void printInfo() {
        System.out.println("Масса объекта:" + getWeight());
    }

    @Override
    public String toString(){
        return getName() + " - естественный спутник объекта " + rotationPoint().getName() +
                ". Масса - " + getWeight() + " кг" +
                ". Диаметр - " + getDiameter() + " км" +
                ".  Расстояние до ближайшей звезды - " + getDistanceFromSun() + " млн км" +
                ". Высота орбиты - " + getOrbit() + " км";
    }
}
