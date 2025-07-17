package com.gtech.seleniumjava;

class A3_OpStaMethAMethOverldg {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return a / b;
	}

	static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return a / b;
	}

	static int modulo(int a, int b) {
		if (b == 0) {
			System.out.println("Modulo by zero is not allowed!");
			return 0;
		}
		return a % b;
	}

	static double modulo(double a, double b) {
		if (b == 0) {
			System.out.println("Modulo by zero is not allowed!");
			return 0;
		}
		return a % b;
	}
}
