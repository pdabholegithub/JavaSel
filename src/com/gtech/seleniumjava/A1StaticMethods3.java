package com.gtech.seleniumjava;

//Call the static method 5 times in the main method
public class A1StaticMethods3 {
	public static void staticMethod() {
		System.out.println("Static method is called in Main Method");
	}

	public static void staticMethod2() {
		System.out.println("Static method 2 is called in Main Method");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			staticMethod();

		}
		for (int i = 0; i < 5; i++) {
			staticMethod2();

		}

	}

}
