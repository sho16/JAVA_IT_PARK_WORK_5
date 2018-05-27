public class Automobile  extends Transport{
 
    private String color;
 
    public Automobile(boolean mtruck, String mdiesel, int mdoors) {
        super(mtruck, mdiesel, mdoors);
        this.color="White";
    }
 
    public Automobile (boolean mtruck, String mdiesel, int mdoors, String color){
        super(mtruck, mdiesel, mdoors);
        this.color=color;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
}
