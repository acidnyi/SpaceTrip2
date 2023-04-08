package spacetrip.spacetrip2.Planets;

public class DeadPlanet extends Planet{

    String causeOfDeath;
    public DeadPlanet(String name, String causeOfDeath){
        super(name);
        this.causeOfDeath=causeOfDeath;
    }

    @Override
    public String getInfo(){

        return this.name+", "+"this is a dead planet "+this.causeOfDeath;
    }
}
