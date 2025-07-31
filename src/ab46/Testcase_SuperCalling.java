package ab46;

class Reporting {
	Reporting() {
		System.out.println("Reporting");

	}

}

class Screenshots extends Reporting {
	Screenshots() {
		super();
		System.out.println("Screenshots");

	}

}

public class Testcase_SuperCalling extends Screenshots {

	Testcase_SuperCalling() {
		super();
		System.out.println("Testcase_SuperCalling");

	}

	public static void main(String[] args) {
		new Testcase_SuperCalling();

	}

}
