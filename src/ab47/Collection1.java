package ab47;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(45);
		c1.add("Prasad");
		c1.add(171);
		c1.add(6.8);
		c1.add(true);
		c1.add('c');
		System.out.println(c1);
		Collection c2 = new ArrayList<>();
		c2.addAll(c1);
		c2.add(98);
		System.out.println(c2);

		boolean b1 = c1.equals(c2);
		System.out.println("The value of boolean b1:" + b1);

		boolean b2 = c1.contains("Prasad");
		System.out.println("The value of boolean b2:" + b2);

		boolean b3 = c2.contains(c1);
		System.out.println("The value of boolean b3:" + b3);

		// c1.clear();
		// System.out.println("The value of c1 after clear operation:" +c1);
		System.out.println("The value of c2:" + c2);

		boolean b4 = c1.isEmpty();
		System.out.println("The value of boolean b4:" + b4);

		c1.remove("Prasad");
		System.out.println("The new c1 is:" + c1);
		c2.removeAll(c1);
		System.out.println("The new c1 is:" + c2);

	}

}
