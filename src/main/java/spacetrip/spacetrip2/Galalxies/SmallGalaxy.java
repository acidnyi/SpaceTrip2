package spacetrip.spacetrip2.Galalxies;

import spacetrip.spacetrip2.Planets.*;

public class SmallGalaxy extends Galaxy{


    public SmallGalaxy(String name){
        super(name);
        this.size=100;
        planets =new Planet[4];
        planets[0]=new RoboticPlanet("Shelezyaka", false, false, false);
        planets[1]=new SavagePlanet("Krina", "in the ruins of their civilization");
        planets[2]=new DeadPlanet("Koleida", "died from space plague");
        planets[3]=new DesertPlanet("Pluk", "Gravitsappa");
    }
}
