public class Strings extends Instrument
{
    private boolean bow;
  
    public Strings(String name, boolean bow){
        super(name,"Strings");
        this.bow = bow;
    }
    
    public void setBow(boolean bow){
        this.bow=bow;
    }
    public boolean getBow(){
        return bow;
    }
}
