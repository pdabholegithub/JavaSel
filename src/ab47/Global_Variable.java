package ab47;

public class Global_Variable {
	static int a = 100; // Global variable
	int b = 100; // Global variable
	static double pi;
	static String name;
	static boolean answer;
	//answer true; It will give an error for invalid variable.
	public static void main(String[] args) {
		int c = 90; // Local variable
		answer = false;
		name = "Prasad";
		System.out.println(c + a);
		System.out.println(pi); // for default value
		System.out.println(name); // for default value
		answer = true;
		System.out.println(answer); // for default value
		answer = true;
	}

}
