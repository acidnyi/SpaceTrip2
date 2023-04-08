package spacetrip.spacetrip2.Planets;

public class FrozenPlanet extends Planet{

    private double temperature;
    public FrozenPlanet(String name, double temperature){
        super(name);
        this.temperature=temperature;
    }

    @Override
    public String getInfo(){
        return this.name+", "+"this is a frozen planet with temperature: "+this.temperature+" C";
    }
}
