public class Fruit extends HealthyFood
{
    private boolean inSeason;
    private String vitamins;
    
    public Fruit(String name, int calories, String color, boolean inSeason,String vitamins){
        super(name,calories,"fruit",color);
        this.inSeason = inSeason;
        this.vitamins = vitamins;
    }
    
    public boolean isInSeason(){
        return inSeason;
    }
    public String getVitamins(){
        return vitamins;
    }
    
}
