package ab46;

import java.util.Scanner;

public class CircumOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Pi:");
		double Pi = s1.nextDouble();
		System.out.println("Enter the value of Radius:");
		double r = s1.nextDouble();
		double cocircle = 2 * Pi * r;
		System.out.println("Circumference of Circle= " + cocircle);
	}
}
