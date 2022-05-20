package com.dmdev.homework.week3.StarSystem;

public final class SpaceUtils {

    private final static double GRAVITY = 6.67 * Math.pow(10, -11);

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceObject spaceObject){
        return !(spaceObject instanceof Satellite);
    }

    public static double calculateGravitation(SpaceObject spaceObject1, SpaceObject spaceObject2){
        double distance = Math.max(spaceObject1.getDistanceFromSun(), spaceObject2.getDistanceFromSun()) - Math.min(spaceObject1.getDistanceFromSun(), spaceObject2.getDistanceFromSun());
        return GRAVITY * (spaceObject1.getWeight() * spaceObject2.getWeight()) / Math.pow(distance,2);
    }

}
