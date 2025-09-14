package ab47;

public class StringStringBufferStringBuilder {

	public static void main(String[] args) {
		String name = new String("Selenium");
		String name1 = name.concat(" Testing");
		System.out.println(name);
		System.out.println(name1);

		StringBuffer s1 = new StringBuffer("Prasad");
		s1.append(" Dabhole");
		System.out.println(s1);

		StringBuilder s2 = new StringBuilder("India");
		s2.append(" Beautiful Country");
		System.out.println(s2);

	}

}
