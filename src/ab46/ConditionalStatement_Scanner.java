package ab46;

import java.util.Scanner;

public class ConditionalStatement_Scanner {

	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner s1 = new Scanner(System.in);
		int ageofperson = s1.nextInt();

		if (ageofperson >= 18) {
			System.out.println("You are eligible to Vote");
		} else {
			System.out.println("You are not eligible to Vote");
		}
		s1.close();

	}

}
