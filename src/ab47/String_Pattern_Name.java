package ab47;

public class String_Pattern_Name {

	public static void main(String[] args) {
		String name = "Prasad";
		// Print characters line by line
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));

		}
		System.out.println("&");
		// Print reverse characters line by line
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

	}

}
