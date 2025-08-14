package ab46;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		String s1 = "rama";
		String s2 = "amar";
		if (s1.length() != s2.length()) {
			System.out.println("Two given strings are not Anagram");
		} else {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			// sorting
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean b1 = Arrays.equals(c1, c2);
			if (b1 == true) {
				System.out.println("Two given strings are Anagram");

			} else {
				System.out.println("Two given strings are not Anagram");
			}

		}

	}

}
