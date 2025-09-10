package ab46;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add(56);
		s1.add(75);
		s1.add(96);
		s1.add(12);
		s1.add("PSD");
		s1.add('X');
		s1.add(56);
		s1.add(56);
		s1.add(null);
		s1.add(null);
		System.out.println(s1);

	}

}
