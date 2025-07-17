package ab46;

public class Constructor_Overloading {
	Constructor_Overloading() {
		System.out.println("1st");

	}

	Constructor_Overloading(int a) {
		System.out.println("2nd");

	}
	Constructor_Overloading(int a, int b) {
		System.out.println("3rd");

	}

	public static void main(String[] args) {
		Constructor_Overloading c1 = new Constructor_Overloading();
		new Constructor_Overloading();
		new Constructor_Overloading();
		new Constructor_Overloading(500);
		new Constructor_Overloading(500,1000);
		Constructor_Overloading c2 = new Constructor_Overloading(500);
		Constructor_Overloading c3 = new Constructor_Overloading(10,400);

	}

}
