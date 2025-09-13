package ab47;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Prasad", 200000);
		m1.put("Shashank", 250000);
		m1.put("Ayush", 150000);
		m1.put("Sahil", 100000);
		m1.put("Kunal", 2500000);
		m1.put("Tanvika", 300000);
		System.out.println(m1);

		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Omkar", 75000);
		System.out.println(m2);
		m2.putAll(m1);
		System.out.println(m2);

		boolean b1 = m1.isEmpty();
		System.out.println(b1);

		m1.clear();
		System.out.println(m1);

	}

}
