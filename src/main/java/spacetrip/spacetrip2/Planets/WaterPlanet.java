package spacetrip.spacetrip2.Planets;

public class WaterPlanet extends Planet{

    boolean waves;
    public WaterPlanet(String name, boolean waves){
        super(name);
        this.waves=waves;
    }

    @Override
    public String getInfo(){
        String wave;
        if(this.waves)
            wave="with extremely high waves";
        else
            wave="without dangerous waves";
        return this.name+", "+"this is water world "+wave;
    }
}

