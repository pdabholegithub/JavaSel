package ab46;

public class AssertionClass {

	public static void main(String[] args) {
		int age = 81;
		// assert age >= 18;
		assert age >= 18 : "Sorry, the age of the person is not expected";
		System.out.println("The age of person is " + age);
	}

}
