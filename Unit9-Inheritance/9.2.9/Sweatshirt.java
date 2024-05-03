public class Sweatshirt extends Clothing
{
    private boolean hooded;
    
    public Sweatshirt(String size, String color, boolean hooded){
        super(size,color);
        this.hooded=hooded;
    }
    public boolean hasHood(){
        return hooded;
    }

}
