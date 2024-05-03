public class HealthyFood extends Food
{
    private String group;
    private String color;
    
    public HealthyFood(String name, int calories, String group, String color){
        super(name,calories);
        this.group = group;
        this.color = color;
    }
    public String getGroup(){
        return group;
    }
    public String getColor(){
        return color;
    }
}
