import java.util.*;

public class MainD {

    public static int digits(int dg){
        int sum = 0;
        while (dg > 0){
            sum = dg % 10 +sum;
            dg = dg/10;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(digits(534));
    }
}