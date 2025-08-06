package abstract_classes;

abstract class class3 {
	abstract void method1(); // abstract method

	abstract void method2();

	void method3() { // concrete method

		System.out.println("Logic for logout from the system");
	}

}

abstract class class2 extends class3 {
	abstract void method4(); // abstract method

	abstract void method5(); // abstract method

}

public class class1 extends class2 {

	public static void main(String[] args) { // concrete method
		class1 c1 = new class1();
		c1.method3();

	}

	void method4() { // concrete method

	}

	void method5() { // concrete method

	}

	void method1() { // concrete method

	}

	void method2() { // concrete method

	}

}
