package ab47;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_3 {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Prasad", 200000);
		m1.put("Shashank", 250000);
		m1.put("Ayush", 150000);
		m1.put("Sahil", 100000);
		m1.put("Kunal", 2500000);
		m1.put("Tanvika", 300000);
		System.out.println("Result of m1:" + m1);

		m1.replace("Tanvika", 350000);
		m1.replace("Kunal", 2500000, 275000);
		System.out.println("Result of m1 after replace:" + m1);

		m1.remove("Prasad");
		m1.remove("Kunal", 275000);
		System.out.println("Result of m1 after remove:" + m1);
	}

}
