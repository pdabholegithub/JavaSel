package ab47;

public class TypeCasting_Example {

	public static void main(String[] args) {
		// widening
		int a = 10;
		double d1 = a;
		//double d1 = (double) a;
		System.out.println(d1);
		
		// narrowing
		double d2 = 10.90;
		int a1 = (int) d2;
		System.out.println(a1);

	}

}
