package ab47;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Finally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = -1;

		while (true) {
			try {
				System.out.print("Enter array size: ");
				size = sc.nextInt();
				int[] rollno = new int[size]; // will throw exception if size < 0
				rollno[0] = 78;
				rollno[1] = 99;
				rollno[2] = 55;
				System.out.println("Array created successfully with size " + size);
				break; // exit loop once successful

			} catch (NegativeArraySizeException al) {
				System.out
						.println("❌ The array size can only be a positive numeric value, please enter correct value.");

			} catch (ArrayIndexOutOfBoundsException a2) {
				System.out.println("❌ Size of array is too small for storing 3 elements, please increase it.");

			} catch (InputMismatchException a3) {
				System.out.println("❌ Invalid input! Please enter a positive numeric value.");
				sc.nextLine(); // clear the invalid input

			}
		}

		sc.close();
	}
}
