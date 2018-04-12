
class Circle1 implements Figure21 {

	private int r;
	

	Circle1(int R) {
		r = R;

	}

	public int getRadius() {
		return r;
	}

	//public void setRadius(int r) {
	//	this.r = r;
	//}

	public double getArea() {
		return Math.PI * r * r;
	}

}




class Rectangle1 implements Figure21 {
	
	private int a;
	private int b;
	
	Rectangle1(int A,int B) {
		a = A;
		b = B;

	}
	
	
	public double getArea() {
		return a * b;
	}

}







// ==================================================================
public class Figure_array {

	public static void main(String[] args) {
		Circle1 c = new Circle1(3);
		Figure21[] f = new Figure21[2];
		Rectangle1 rec = new Rectangle1 (3,5);
		f[0] = c;
		f[1] = rec;
		

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].getArea());
		}

	}

}
