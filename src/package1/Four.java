package package1;

public class Four extends Three {
	void sub() {
		System.out.println("This is sub class method of - Four");

	}

	public static void main(String[] args) {
		Four f = new Four();
		f.add();
		f.sub();
	}

}
