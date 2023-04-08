package spacetrip.spacetrip2.Planets;

public class JunglePlanet extends Planet{

    String weather;
    public JunglePlanet(String name, String weather){
        super(name);
        this.weather=weather;
    }

    @Override
    public String getInfo(){
        return this.name+", "+"this is a jungle planet, with "+this.weather;

    }
}