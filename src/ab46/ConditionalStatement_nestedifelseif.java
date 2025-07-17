package ab46;

public class ConditionalStatement_nestedifelseif {
	public static void main(String[] args) {
		char gender1 = 'M';
		char gender2 = 'F';
		int age = 1;
		if (gender1 == 'M') {
			if (age < 3) {
				System.out.println("No Fare for male child");
			}
			if (age > 12) {
				System.out.println("Adult Fare");

			} else {
				System.out.println("Half ticket Fare");

			}
		}

		else {
			System.out.println("No fare for female");
		}
	}

}
