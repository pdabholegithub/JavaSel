package ab47;

import java.util.Arrays;

public class Array_Iteration_Reverse {

	public static void main(String[] args) {
		int array1[] = new int[4];
		array1[0] = 75;
		array1[1] = 55;
		array1[2] = 65;
		array1[3] = 45;
		int array2[] = new int[4];
		for (int i = 0, k = array2.length -1; i < array1.length; i++, k--) {
			array2[k] = array1[i];
		}
		System.out.println("Array 1 data: " + Arrays.toString(array1));
		System.out.println("Array 2 data: " + Arrays.toString(array2));

	}

}
