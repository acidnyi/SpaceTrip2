package spacetrip.spacetrip2.Galalxies;

import spacetrip.spacetrip2.Planets.*;

public class BigGalaxy extends Galaxy{

    public BigGalaxy(String name){
        super(name);
        size=1500;
        planets=new Planet[6];
        planets[0]=new FrozenPlanet("Hoth", -220);
        planets[1]=new JunglePlanet("Dagobah", "violent lightning storms, dense fog");
        planets[2]=new JunglePlanet("Risa",  "warm and sunny climate");
        planets[3]=new SavagePlanet("Pandora", "in forests");
        planets[4]=new RoboticPlanet("Alpha", true, true, true);
        planets[5]=new WaterPlanet("4546B", false);
    }
}
