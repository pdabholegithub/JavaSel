package ab47;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Java");
		vector.add("Python");
		vector.add("C++");
		vector.add("99");
		vector.add("Yes");

		// Get Enumeration
		Enumeration<String> e = vector.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
