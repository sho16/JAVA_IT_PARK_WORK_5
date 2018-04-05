
class constr1 {
   int a;
   int b;
  
   
   constr1 (int A, int B ) {
	   a=A;
	   b=B;
	   
      
   }
}

 // вместе с todouble

public class show{

	   public static void main(String args[]) {
		   
		   constr1 t1 = new constr1(10, 4);
		 
		System.out.println(todouble(t1.a,t1.b));
		System.out.println(show(t1.a,t1.b));
		
		
		 
	      
	     
	   }

	private static double todouble(int x, int y) {
		
		return  x / y;
		   	
		     
		   }
	
	
private static int show(int e, int r) {
		
		return  e + r;
		   	
		     
		   }



	
	


	}
