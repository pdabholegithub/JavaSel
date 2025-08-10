package ab46;

import java.util.Scanner;

public class Scanner_Method3 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your school name");
		String FirstName = s1.next();
		System.out.println("What subject you like most?");
		String Sub = s1.next();
		//boolean b1 = s1.nextBoolean();
		//byte b2 = s1.nextByte();
		s1.close();

	}

}