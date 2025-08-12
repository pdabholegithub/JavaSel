package ab47;

import java.util.Arrays;

public class Array_Program1 {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0] = 89;
		rollno[1] = 8;
		rollno[2] = 65;
		rollno[3] = 99;
		System.out.println(Arrays.toString(rollno));

		String name[] = new String[4];
		name[0] = "Nishad";
		name[1] = "Manisha";
		name[2] = "Prasad";
		name[3] = "Dabhole";
		for (int i = 0; i <= 3; i++) {
			System.out.println(name[i]);
		}

	}

}
