package ab46;

public class MethodOverloading {

	// Non Static Methods

	void addition(double a, double b) {
		double sum = a + b;
		System.out.println(sum);

	}

	void addition(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}
	void addition() {
		int a = 500;
		int b = 1500;
		int sum = a + b;
		System.out.println(sum);

	}
	// Static Methods

	static void addition(int a, double b) {
		double sum = a + b;
		System.out.println(sum);

	}

	static void addition(double a, int b) {
		double sum = a + b;
		System.out.println(sum);

	}
	static void addition(boolean b, String c, char d) {
		System.out.println(b);
		System.out.println("My name is " + c);		
		System.out.println(d);
	}

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.addition(32, 64);
		m1.addition(6.96, 9.98);
		m1.addition();
		addition(60, 9.98);
		addition(60.66, 98);
		addition(true, "Nishad", 'N');

	}

}
