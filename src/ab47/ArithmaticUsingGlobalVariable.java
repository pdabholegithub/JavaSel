package ab47;

public class ArithmaticUsingGlobalVariable {
	static int a = 100;
	static int b = 201;

	static void add() {
		int sum = a + b;
		System.out.println(sum);

	}

	static void sub() {
		int sub = a - b;
		System.out.println(sub);

	}

	static void mul() {
		int mul = a * b;
		System.out.println(mul);

	}

	static void div() {
		int div = b / a;
		System.out.println(div);

	}

	static void mod() {
		int mod = b % a;
		System.out.println(mod);

	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

	}

}
