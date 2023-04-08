package spacetrip.spacetrip2.Planets;

public class SpaceShipPlanet extends Planet{
    public SpaceShipPlanet(String name){
        super(name);
    }

    @Override
    public String getInfo(){

        return this.name+", "+"this is multitraditional spaceship with different races";
    }
}