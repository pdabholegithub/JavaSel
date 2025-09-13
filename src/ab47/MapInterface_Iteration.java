package ab47;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface_Iteration {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Prasad", 200000);
		m1.put("Shashank", 250000);
		m1.put("Ayush", 150000);
		m1.put("Sahil", 100000);
		m1.put("Kunal", 2500000);
		m1.put("Tanvika", 300000);
		System.out.println("Result of m1:" + m1);

		System.out.println("Result of m1 with keyset:" + m1.keySet());
		System.out.println("Result of s1 for KeySet:");
		for (String s1 : m1.keySet())

		{

			System.out.println(s1);
		}
		System.out.println("Result of i1 for Values:");

		for (Integer i1 : m1.values()) {
			System.out.println(i1);
		}
		System.out.println("Result of i2 for entryset:");
		for (Entry<String, Integer> i2 : m1.entrySet()) {
			System.out.println(i2);
		}
		
		System.out.println("Using Iterator:");
		Iterator<Entry<String, Integer>> i3 = m1.entrySet().iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
			
		}

	}

}
