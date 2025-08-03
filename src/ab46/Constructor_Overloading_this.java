package ab46;

public class Constructor_Overloading_this {
	Constructor_Overloading_this() {
		this(100);
		System.out.println("1st");

	}

	Constructor_Overloading_this(int a) {
		this(555, "Nishad");
		System.out.println("2nd");

	}

	Constructor_Overloading_this(int a, int b) {
		System.out.println("3rd");

	}

	Constructor_Overloading_this(int a, String b) {
		this(45, 88);
		System.out.println("4th");

	}

	public static void main(String[] args) {

		new Constructor_Overloading_this(100,"PSD");

	}

}
