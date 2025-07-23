package ab47;

class One // Super Class
{
	static void add() {
		System.out.println("This is addition method");

	}

	static void sub() {
		System.out.println("This is subtraction method");

	}

}

public class SingleInheritance extends One // sub class
{
	static void mul() {
		System.out.println("This is multiplication method");

	}

	static void div() {
		System.out.println("This is division method");

	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}

}
