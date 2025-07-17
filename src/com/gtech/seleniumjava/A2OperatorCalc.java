package com.gtech.seleniumjava;
//Operators(+,-,*,/,%) using non_static method

public class A2OperatorCalc {
	// Non-static method for addition
	public int add(int a, int b) {
		return a + b;
	}

	// Non-static method for subtraction
	public int substract(int a, int b) {
		return a - b;
	}

	// Non-static method for multiplication
	public int multiply(int a, int b) {
		return a * b;
	}

	// Non-static method for division
	public int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed.");
			return 0;
		}

		return a / b;
	}

	// Non-static method for modulus
	public int modulus(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		A2OperatorCalc opcalc = new A2OperatorCalc();
		System.out.println("Addition: " + opcalc.add(55, 5));
		System.out.println("Substraction: " + opcalc.substract(55, 5));
		System.out.println("Multiplication: " + opcalc.multiply(55, 5));
		System.out.println("Division: " + opcalc.divide(55, 5));
		System.out.println("Modulus: " + opcalc.modulus(56, 5));

	}

}
