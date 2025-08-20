package ab47;

public class Programs1 {

	public static void main(String[] args) {
		// String functions : Equality of words by ignoring the upper & lower case
		String name = "Prasad";
		boolean b1 = name.equalsIgnoreCase("prasad");
		System.out.println(b1);

		// String functions : Replace k with n
		String name1 = "kv no 2";
		String name2 = name1.replace("k", "n");
		System.out.println(name2);

		// String functions : Replace boy with girl.
		String name3 = "I have a boy";
		String name4 = name3.replace("boy", "girl");
		System.out.println(name4);

		// String functions : Replace 2 with nothing ie. no value
		String name5 = "kv no 2";
		String name6 = name5.replace("2", "");
		System.out.println(name6);

		// String functions : Replace entire alphabets with nothing ie. no value
		String name7 = "kv no 2";
		String name8 = name7.replaceAll("[a-z]", "");
		System.out.println(name8);

		// String functions : Replace capital letters with nothing ie. no value
		String name9 = "Prasad Shankar Dabhole";
		String name10 = name9.replaceAll("[A-Z]", "");
		System.out.println(name10);

		// String functions : Replace all numeric values with nothing ie. no value
		String name11 = "Paras bank balance is USD 98989";
		String name12 = name11.replaceAll("[0-9]", "");
		System.out.println(name12);

	}

}
