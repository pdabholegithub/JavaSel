package ab47;

class Parent_Class_Scanner extends Object {
	void add() {
		System.out.println("Parent Class");

	}

}

public class ClassTypeCasting extends Parent_Class_Scanner {
	void sub() {

	}

	public static void main(String[] args) {
		// implicit way of upcasting
		Parent_Class_Scanner p1 = new ClassTypeCasting();

		// explicit way of upcasting
		Parent_Class_Scanner p2 = (Parent_Class_Scanner) new ClassTypeCasting();

		// Explicit way of downcasting
		// ClassTypeCasting c1 = (ClassTypeCasting) new Parent_Class_Scanner();
		System.out.println(p1);
		System.out.println(p2);
		// System.out.println(c1);
		

	}

}
