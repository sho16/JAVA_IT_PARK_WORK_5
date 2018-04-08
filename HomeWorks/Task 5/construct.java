import java.util.Random;

class con1 {
	int a;
	int b;

	con1(int A, int B) {
		Random rand = new Random();
		int n = rand.nextInt(100);
		int m = rand.nextInt(100);
		a = A * n;
		b = B * m;

	}
}
// ---------------------------------------------

class constr {
	int a;
	int b;

	constr(int A, int B) {
		a = A;
		b = B;

	}
}

public class construct {

	public static void main(String args[]) {
		constr t1 = new constr(15, 5);
		con1 t2 = new con1(10, 4);
		// System.out.println(t1.a / t1.b);
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t2.a + "/" + t2.b);
		show(t1.a, t1.b);
		System.out.println(nod(t1.a, t1.b));
		todouble(t1.a, t1.b);
		System.out.println(
				"Дробь:" + t1.a + "/" + t1.b + "->" + t1.a / nod(t1.a, t1.b) + "/" + t1.b / nod(t1.a, t1.b) + "->");

	}

	// ------------------------------------------------------------

	// --------------------------------------------------------------
	static void todouble(double x, double y) {

		System.out.println(x);
		System.out.println(y);

	}

	static void show(int e, int r) {

		System.out.println(e + r);

	}

	// --------------------------------------------------------------

	static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}

		return a + b;
	}

	// --------------------------------------------------------------

	static void optimize(int a, int b)

	{

	}

}
