package ab46;

public class ConditionalStatement_ifelseif {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;

		if (a != b) {
			System.out.println("If Block is Executed");
		} else if (b == c) {
			System.out.println("Else If 1st Block is Executed");
		} else if (a == c) {
			System.out.println("Else If 2nd Block is Executed");
		} else {
			System.out.println("Else Block is Executed");
		}

	}

}
