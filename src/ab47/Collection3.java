package ab47;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection3 {

	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(76);
		li.add(7);
		li.add(6);
		li.add(760);
		li.add(706);
		li.add(607);
		li.add(67);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Iterator i1 = li.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());

		}

	}

}
