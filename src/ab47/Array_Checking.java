package ab47;

import java.util.Arrays;

public class Array_Checking {

	public static void main(String[] args) {
		int no1[] = new int[4];
		no1[0] = 78;
		no1[1] = 4;
		no1[2] = 60;
		no1[3] = 99;
		int no2[] = new int[4];
		no2[0] = 78;
		no2[1] = 45;
		no2[2] = 60;
		no2[3] = 99;
		boolean b1 = Arrays.equals(no1, no2);
		System.out.println(b1);
		if (b1 == true) {
			System.out.println("Two arrays are equal to each other");
		} else {
			System.out.println("Two arrays are not equal to each other");
		}

	}

}
