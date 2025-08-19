package ab47;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValue_Runtime {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		System.out.println("Enter the values:");
		Scanner s1 = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			rollno[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));

	}

}
