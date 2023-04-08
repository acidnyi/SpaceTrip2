package spacetrip.spacetrip2.Planets;

public class SavagePlanet extends Planet{

    String placeOfLiving;
    public SavagePlanet(String name, String placeOfLiving){
        super(name);
        this.placeOfLiving=placeOfLiving;
    }

    @Override
    public String getInfo(){

        return this.name+", "+"this is planet with savages, which are living "+ this.placeOfLiving;
    }
}