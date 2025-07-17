package ab46;

public class Static_5Methods_Class2 {
	// method 1
	public static void addition(int a, int b) {
		System.out.println("Addition:" + (a + b));

	}

	// method 2
	public static void Subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

	// method 3
	public static void multiplication(int a, int b) {
		System.out.println("Multiplication:" + (a * b));

	}

	// method 4
	public static void division(int a, int b) {
		System.out.println("Division:" + (a / b));

	}

	public static void main(String[] args) {
		System.out.println("Static methods are cool!");
		addition(20,5);
		Subtraction(20,5);
		multiplication(20,5);
		division(20,5);
		
	}
}
