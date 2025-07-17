package ab47;

public class FinalVariable3 {
	final int a = 500;
	final static double a1 = 750;

	public static void main(String[] args) {
		// a = 550;
		FinalVariable3 fv3 = new FinalVariable3();
		int b = 200;
		b = 250;
		// double a =300;
		// double b = 600;
		System.out.println(fv3.a);
		System.out.println(b);
		System.out.println(a1);
	}

}
