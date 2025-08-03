package ab46;

class Reporting4 {
	Reporting4() {
		System.out.println("Reporting4");

	}

}

class Screenshots4 extends Reporting4 {
	Screenshots4() {

		System.out.println("Screenshots4");

	}

}

public class Testcase_WithoutSuperCalling4 extends Screenshots4 {

	Testcase_WithoutSuperCalling4() {

		System.out.println("Testcase_WithoutSuperCalling4");

	}

	public static void main(String[] args) {
		new Testcase_WithoutSuperCalling4();

	}

}
