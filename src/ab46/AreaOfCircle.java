package ab46;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Pi:");
		double Pi = s1.nextDouble();
		System.out.println("Enter the value of Radius:");
		double r = s1.nextDouble();
		double area = Pi * r * r;
		System.out.println("Area of Circle= " + area);
	}
}
