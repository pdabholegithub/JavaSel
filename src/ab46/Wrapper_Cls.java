package ab46;

import java.util.Arrays;

public class Wrapper_Cls {
	static int count_of_alphabets;
	static int count_of_digits;
	static int count_of_spaces;
	// static int count_of_special_characters;

	public static void main(String[] args) {
		String input = "kv no 2 pune @$#";
		char c1[] = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i = 0; i < input.length(); i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			if (b1 == true) {
				count_of_alphabets++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if (b2 == true) {
				count_of_digits++;

			}
			boolean b3 = Character.isWhitespace(c1[i]);
			if (b3 == true) {
				count_of_spaces++;

			}
		}
		System.out.println("The count of alphabets is " + count_of_alphabets);
		System.out.println("The count of digits is " + count_of_digits);
		System.out.println("The count of spaces is " + count_of_spaces);
		int count_of_special_characters = input.length() - (count_of_alphabets + count_of_digits + count_of_spaces);
		System.out.println("The count of special characters is " + count_of_special_characters);

	}
}