package ab46;

import java.util.Scanner;

public class ConditionalStatement_nestedifelseif_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0); // handles lowercase input too
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        // Logic
        if (gender == 'M') {
            if (age <= 3) {
                System.out.println("No Fare for male child");
            } else if (age > 12) {
                System.out.println("Adult Fare");
            } else {
                System.out.println("Half ticket Fare");
            }
        } else if (gender == 'F') {
            System.out.println("No fare for female");
        } else {
            System.out.println("Invalid gender entered");
        }

        sc.close();
    }
}

