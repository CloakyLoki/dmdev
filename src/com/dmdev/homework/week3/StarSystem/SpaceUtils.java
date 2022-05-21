package com.dmdev.homework.week3.StarSystem;

public final class SpaceUtils {

    private final static double GRAVITY = 6.67 * Math.pow(10, -11); //гравитационная постоянная

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceObject spaceObject) {
        //метод будет работать в рамках одной солнечной системы, когда звезда не вращается вокруг более крупного объекта
        return !(spaceObject instanceof Satellite);
    }

    public static double calculateGravitation(SpaceObject spaceObject1, SpaceObject spaceObject2) {

        //более удаленный от солнца объект
        double distantRange = Math.max(spaceObject1.getDistanceFromSun(), spaceObject2.getDistanceFromSun());
        //более близкий к солнцу объект
        double closeRange = Math.min(spaceObject1.getDistanceFromSun(), spaceObject2.getDistanceFromSun());
        double distance = distantRange - closeRange;
        return GRAVITY * (spaceObject1.getWeight() * spaceObject2.getWeight()) / Math.pow(distance, 2);
    }
}
