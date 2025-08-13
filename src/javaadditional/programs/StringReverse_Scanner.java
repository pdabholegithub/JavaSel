package javaadditional.programs;

import java.util.Scanner;

public class StringReverse_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str = sc.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));

		}
		// System.out.println();
		sc.close();

	}

}
