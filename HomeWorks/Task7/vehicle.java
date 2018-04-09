public class vehicle {
 
    public static void main(String[] args) {
        Automobile Automobile = new Automobile(false, "diesel",2, "red");
 
        System.out.println("Automobile is passanger?" + Automobile.isTruck());
        System.out.println("Automobile oil " + Automobile.getDiesel());
        System.out.println("Automobile has  " + Automobile.getDoors() + " doors.");
        Automobile.setColor("Yelow");
        System.out.println("Automobile color is " + Automobile.getColor());
        
    }
 
}
