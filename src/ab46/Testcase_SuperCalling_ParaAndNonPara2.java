package ab46;

class Reporting2 {
	Reporting2(String a) {
		System.out.println("Reporting2");

	}

}

class Screenshots2 extends Reporting2 {
	Screenshots2(String b, String c) {
		super("PSD");
		System.out.println("Screenshots2");

	}

}

public class Testcase_SuperCalling_ParaAndNonPara2 extends Screenshots2 {

	Testcase_SuperCalling_ParaAndNonPara2() {
		super("PSD", "PSD");
		System.out.println("Testcase_SuperCalling_ParaAndNonPara");

	}

	public static void main(String[] args) {
		new Screenshots2("Yes", "No");

	}

}
