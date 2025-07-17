package ab46;

public class Non_Static_Method {
	void addition() {
		System.out.println("Adding 2 numbers");
	}

	void subtraction() {
		System.out.println("Subtracting 2 numbers");
	}

	public static void main(String[] args) {

		Non_Static_Method n1 = new Non_Static_Method();
		n1.addition();
		n1.subtraction();
		System.out.println("My Main Method");
	}

}
