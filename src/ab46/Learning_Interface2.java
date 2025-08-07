package ab46;

interface Class1 {
	void login();

	void registration();

}

interface Class2 {
	void login1();

	void registration1();

}

public class Learning_Interface2 implements Class1, Class2 {

	public static void main(String[] args) {

		Learning_Interface2 li = new Learning_Interface2();
		li.login();
		li.registration();
		li.login1();
		li.registration1();
	}

	public void login1() {
		System.out.println("This is login 1 method");

	}

	public void registration1() {
		System.out.println("This is registration 1 method");

	}

	@Override
	public void login() {
		System.out.println("This is login method");

	}

	@Override
	public void registration() {
		System.out.println("This is registration method");

	}

}
