package ab46;

public class MathsOperations {

	static void addition() {
		int a = 1000;
		int b = 500;
		int sum = a + b;
		System.out.println("The sum of a & b is -> " + sum);
	}

	static void subtraction() {
		int a = 1000;
		int b = 500;
		int sub = a - b;
		System.out.println("The subtraction of a & b is -> " + sub);
	}

	static void multiplication() {
		int a = 1000;
		int b = 500;
		int mul = a * b;
		System.out.println("The multiplication of a & b is -> " + mul);
	}

	static void division() {
		int a = 1000;
		int b = 500;
		int div = a / b;
		System.out.println("The division of a & b is -> " + div);
	}

	static void modulus() {
		int a = 1001;
		int b = 500;
		int mod = a % b;
		System.out.println("The modulus of a & b is -> " + mod);
	}

	public static void main(String[] args) {
		addition();
		subtraction();
		multiplication();
		division();
		modulus();

	}

}
