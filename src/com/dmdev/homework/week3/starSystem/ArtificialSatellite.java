package com.dmdev.homework.week3.starSystem;

public class ArtificialSatellite extends Companion implements Inhabited {

    private final int year;
    private final boolean isInhabited;

    public ArtificialSatellite(String name, double weight, double radius,
                               double distanceFromSun, SpaceObject rotateAround,
                               double orbit, int year, boolean isInhabited) {
        super(name, weight, radius, distanceFromSun, rotateAround, orbit);
        this.year = year;
        this.isInhabited = isInhabited;
    }

    @Override
    public void printInfo() {
        System.out.println("Год запуска:" + year);
    }

    @Override
    public boolean isInhabited() {
        return isInhabited;
    }

    @Override
    public String toString(){
        String inhabitant;
        if(isInhabited){
            inhabitant = "обитаемый";
        } else {
            inhabitant = "необитаемый";
        }
        return getName() + " - искусственный " + inhabitant + " спутник объекта " + rotationPoint().getName() +
                ". Масса - " + getWeight() + " кг" +
                ". Диаметр - " + getDiameter() + " м" +
                ".  Расстояние до ближайшей звезды - " + getDistanceFromSun() + " млн км" +
                ". Высота орбиты - " + getOrbit() + " км";
    }
}
