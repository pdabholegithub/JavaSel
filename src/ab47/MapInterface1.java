package ab47;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1{

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Prasad", "SDET III");
		m1.put("Shashank", "SDE III");
		m1.put("Ayush", "SDE II");
		m1.put("Sahil", "SDE I");
		m1.put("Kunal", "APM");
		m1.put("Tanvika", "SPM");
		System.out.println(m1);

	}

}
