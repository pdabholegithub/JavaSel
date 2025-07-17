package com.gtech.seleniumjava;

//Call the static method 5 times in the main method
public class A1StaticMethods {
	public static void staticMethod() {
		System.out.println("Static method is called in Main Method");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			staticMethod();
		}
	}

}
