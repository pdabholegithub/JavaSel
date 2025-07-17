package ab47;

import java.util.Scanner;

public class ArithmaticUsingGlobalVariable_Scanner {
	static int a;
	static int b;

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
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = s1.nextInt();
		System.out.println("Enter the value of b:");
		b = s1.nextInt();

		add();
		sub();
		mul();
		div();
		mod();

	}

}
