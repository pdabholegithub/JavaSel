package ab46;

import java.util.Scanner;

public class SwitchCase_Scanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter 1 for chrome browser");
		System.out.println("Please enter 2 for edge browser");
		System.out.println("Please enter 3 for safari browser");
		System.out.println("Please enter 4 for firebox browser");
		int input = s1.nextInt();
		switch (input) {
		case 1:
			System.out.println("Launching chrome browser");
			break;
		case 2:
			System.out.println("Launching edge browser");
			break;
		case 3:
			System.out.println("Launching safari browser");
			break;
		case 4:
			System.out.println("Launching firefox browser");
			break;
		default:
			System.out.println("Your selection is wrong, please try again!");

		}

	}

}
