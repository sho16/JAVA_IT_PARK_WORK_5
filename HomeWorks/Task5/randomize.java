import java.util.Random;
 

 
 

class con1 {
	   int a;
	   int b;
	 
	   
	   
	   
	   // Ниже конструктор
	   con1 (int A, int B ) {
		   Random rand = new Random();
		   int n = rand.nextInt(100);  
		   int m = rand.nextInt(100);
		   a=A*n;
		   b=B*m;
		  
		   
		      
		    
	      
	   }
	}
	public class randomize {

		   public static void main(String args[]) {
			   con1 t1 = new con1(10, 4);
			 
		      System.out.println(t1.a);
		      System.out.println(t1.b);
		     
		   }
		}
