package ab47;

public class Programs2_Strings {

	public static void main(String[] args) {
		// String functions : Check if the given string has exactly three letters in it
		String name = "carrot";
		boolean b1 = name.matches("...");
		System.out.println(b1);

		// String functions : Check if the given string starts with c
		boolean b2 = name.matches("c(.*)");
		System.out.println(b2);

		// String functions : Check if the given string ends with t
		boolean b3 = name.matches("(.*)t");
		System.out.println(b3);
		// String functions : Check if the given string contains o
		boolean b4 = name.matches("(.*)g(.*)");
		System.out.println(b4);

		// String functions : Replace all space with underscore
		String name1 = "Prasad Shankar Dabhole";
		String name2 = name1.replaceAll(" ","_");
		System.out.println(name2);

	}

}
