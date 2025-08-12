package ab46;

public class String_Pallindrome {

	public static void main(String[] args) {

		String input = "was it a car or a cat I saw";
		String input1 = input.toLowerCase();
		//String input = "radar";
		String output = "";
		for (int i = input1.length() - 1; i >= 0; i--) {
			char c1 = input1.charAt(i);
			output = output + c1;
		}
		System.out.println(output);
		boolean b1 = input1.equals(output);
		if (b1 == true) {
			System.out.println("It is a Pallindrome");
		} else {
			System.out.println("It is a not an Pallindrome");
		}
	}

}
