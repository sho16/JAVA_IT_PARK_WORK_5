import java.util.*;

public class DEC_BIN {
public static int de;
public static int ost;

public static String bi ="";
public static StringBuffer sbf;
public static void vvod(){
System.out.println("Введите число");
Scanner sc = new Scanner(System.in);
if(sc.hasNextInt()){ 
de = sc.nextInt();
} 
else {
System.out.println("Вы ввели не целое число");
}
}
public static void convert(int d) {

 

 

 

ost = de % 2;
if (ost==0){
bi += "0";
}
else{
bi += "1";
}
sbf = new StringBuffer(bi);

de = de / 2 ;

if (d==1){
//bi += "1";

return ;
}
else
{
convert(de);
}

//return;
}

public static void main(String[] args) {
vvod ();
System.out.print("DEC = " + de + "\n");
convert(de);
System.out.print("BIN = " + sbf.reverse()+ "\n");

}

}

 

