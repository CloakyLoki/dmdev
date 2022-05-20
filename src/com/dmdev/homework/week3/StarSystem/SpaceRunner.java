package com.dmdev.homework.week3.StarSystem;

public class SpaceRunner {

    public static void main(String[] args) {
        Star sun = new Star("Солнце", 1.989E30, 696340, 0, 5778);
        Planet mercury = new Planet("Меркурий", 3.825E23, 2439.7,
                57.9, sun, 57.9, false);
        Planet venus = new Planet("Венера", 4.867E24, 6051.8,
                108.2, sun, 108.2, false);
        Planet earth = new Planet("Земля", 5.9E24, 6356.8,
                150, sun, 150, true);
        NaturalSatellite moon = new NaturalSatellite("Луна", 7.35E22, 1737.4, 150, earth, 384400);
        ArtificialSatellite spaceStation = new ArtificialSatellite("Международная космическая станция", 420000, 100,
                150, earth, 408, 1998, true);
        Planet mars = new Planet("Марс", 6.39E23, 3389.5,
                227.9, sun, 227.9, false);

        System.out.println("Расчетная сила гравитации между " + earth.getName() + " и " + venus.getName() +
                " составляет " + SpaceUtils.calculateGravitation(earth, venus));
        venus.compareObjects(earth);
        System.out.println("Объект " + mars.getName() + " является звездой: " + SpaceUtils.isStar(mars));
        System.out.println("Объект " + sun.getName() + " является звездой: " + SpaceUtils.isStar(sun));
        System.out.println(moon);
        System.out.println(spaceStation);
    }
}
