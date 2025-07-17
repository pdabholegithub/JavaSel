package ab46;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Side:");
		double side = s1.nextDouble();
		double area = side * side;
		System.out.println("Area of Square = " + area);
	}
}
