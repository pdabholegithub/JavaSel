package ab46;

public class Contains_String {

	public static void main(String[] args) {
		String input = "Prasad Shankar Dabhole";
		String input1 = input.toLowerCase();
		boolean b1 = input1.contains("dabhole");
		System.out.println(b1);
		boolean b2 = "Prasad".equals("prasad");
		System.out.println(b2);

	}

}
