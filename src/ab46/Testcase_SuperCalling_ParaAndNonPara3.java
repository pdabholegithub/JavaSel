package ab46;

class Reporting3 {
	Reporting3(String a) {
		System.out.println("Reporting3");

	}

}

class Screenshots3 extends Reporting3 {
	Screenshots3(String b, String c) {
		super("PSD");
		System.out.println("Screenshots3");

	}

}

public class Testcase_SuperCalling_ParaAndNonPara3 extends Screenshots3 {

	Testcase_SuperCalling_ParaAndNonPara3() {
		super("PSD", "PSD");
		System.out.println("Testcase_SuperCalling_ParaAndNonPara");

	}

	public static void main(String[] args) {
		new Reporting3("Yes");

	}

}
