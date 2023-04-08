package spacetrip.spacetrip2.Planets;

public class RoboticPlanet extends Planet{

    boolean minerals;
    boolean water;
    boolean vegetation;
    public RoboticPlanet(String name, boolean minerals, boolean water, boolean vegetation){
        super(name);
        this.minerals=minerals;
        this.water=water;
        this.vegetation=vegetation;
    }

    @Override
    public String getInfo(){
        String mineral;
        String waters;
        String vegetations;
        if(this.minerals)
            mineral=" minerals are on the planet,";
        else
            mineral =" minerals aren`t on the planet,";
        if(this.water)
            waters=" waters are on the planet,";
        else
            waters=" waters aren`t on the planet,";
        if(this.vegetation)
            vegetations=" vegetation are on the planet";
        else
            vegetations=" vegetation aren`t on the planet";
        return this.name+", "+"this is planet with robots"+mineral+waters+vegetations;
    }
}
