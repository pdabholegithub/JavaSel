package ab47;

public class StringBuilder_Class {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Automation");
		System.out.println("s1 before any action: " + s1);
		System.out.println("s1 after reverse: " + s1.reverse());
		System.out.println("s1 after insert: " + s1.insert(0, "Prasad "));
		System.out.println("s1 after append: " + s1.append(" Testing"));

		StringBuilder s2 = new StringBuilder("API Testing");
		System.out.println("s2 before replace: " + s2);
		s2.replace(0, 3, "Manual");
		System.out.println("s2 after replace: " + s2);

		System.out.println("s1 Substring with one parameter: " + s1.substring(3));
		System.out.println("s1 Substring with two parameters: " + s1.substring(1, 3));
		
		System.out.println("S1 delete with two parameters: "+ s1.delete(1,3));

	}

}
