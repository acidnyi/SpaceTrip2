package spacetrip.spacetrip2.Galalxies;

import spacetrip.spacetrip2.Planets.*;

public class Galaxy {

    private String name;
    protected int size;

    Planet[] planets;

    public Galaxy(String nick) {
        this.name = nick;
        this.size = 500;
        planets = new Planet[5];
        planets[0]=new SpaceShipPlanet("City of Thousand Planets");
        planets[1]=new SavagePlanet("Mul", "near the beaches");
        planets[2]=new WaterPlanet("Miller`s planet", true);
        planets[3]=new FrozenPlanet("Mann`s planet", -77.73);
        planets[4]=new DesertPlanet("Tatooine", "T-16 Skyhopper");
    }

    public int getSize() {

        return this.size;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public void getPlanetsNames(){
        for(Planet x: planets){
            System.out.println(x.getInfo());
        }
    }

}