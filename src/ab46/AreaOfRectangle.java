package ab46;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Length:");
		double length = s1.nextDouble();
		System.out.println("Enter the value of Breadth:");
		double breadth = s1.nextDouble();
		double area = length * breadth;
		System.out.println("Area of Rectangle= " + area);
	}
}
