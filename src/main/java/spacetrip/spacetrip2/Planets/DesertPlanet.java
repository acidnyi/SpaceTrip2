package spacetrip.spacetrip2.Planets;

public class DesertPlanet extends Planet{
    String transport;
    public DesertPlanet(String name, String transport){
        super(name);
        this.transport=transport;
    }

    @Override
    public String getInfo(){
        return this.name+", "+"this is a desert planet, where is using "+ this.transport+" for moving";
    }
}