package spacetrip.spacetrip2.Planets;

import spacetrip.spacetrip2.Entertaiment.Entertaiment;

public class Planet {

    protected String name;
    protected String story;

    int xCord;
    int yCord;
    int zCord;

    Entertaiment[] entertaiments;

    String[] raceRestrictions;

    public Planet(String name){

        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String getInfo(){
        return this.name +", "+this.story;
    }

}
