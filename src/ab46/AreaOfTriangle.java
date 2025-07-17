package ab46;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Base:");
		double base = s1.nextDouble();
		System.out.println("Enter the value of Height:");
		double height = s1.nextDouble();
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle = " + area);
	}
}
