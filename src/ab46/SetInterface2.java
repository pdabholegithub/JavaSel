package ab46;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface2 {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(56);
		s1.add(75);
		s1.add(96);
		s1.add(12);
		s1.add("PSD");

		Iterator i1 = s1.iterator();

		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
