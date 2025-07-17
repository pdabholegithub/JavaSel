package ab46;

public class Static_And_Non_Static_Methods {
	static void addition() {
		System.out.println("Addition");
	}

	void subtraction() {
		System.out.println("Subtraction");
	}

	public static void main(String[] args) {
		Static_And_Non_Static_Methods sns = new Static_And_Non_Static_Methods();
		System.out.println("Main Method");
		sns.subtraction();
		addition();

	}

}
