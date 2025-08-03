package ab46;

class Reporting1 {
	Reporting1(String a) {
		System.out.println("Reporting1");

	}

}

class Screenshots1 extends Reporting1 {
	Screenshots1(String b, String c) {
		super("PSD");
		System.out.println("Screenshots1");

	}

}

public class Testcase_SuperCalling_ParaAndNonPara extends Screenshots1 {

	Testcase_SuperCalling_ParaAndNonPara() {
		super("PSD", "PSD");
		System.out.println("Testcase_SuperCalling_ParaAndNonPara");

	}

	public static void main(String[] args) {
		new Testcase_SuperCalling_ParaAndNonPara();

	}

}
