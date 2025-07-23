package ab47;

class One1 // Super Class
{
	void add() {
		System.out.println("This is addition method");

	}

	void sub() {
		System.out.println("This is subtraction method");

	}

}

public class SingleInheritance_NonStatic extends One1 // sub class
{
	void mul() {
		System.out.println("This is multiplication method");

	}

	void div() {
		System.out.println("This is division method");

	}

	public static void main(String[] args) {
		SingleInheritance_NonStatic s1 = new SingleInheritance_NonStatic();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();

	}

}
