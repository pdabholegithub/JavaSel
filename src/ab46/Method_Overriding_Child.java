package ab46;

class Method_Overriding_Parent {
	void login() {
		System.out.println("Login with Email ID");
	}

}

public class Method_Overriding_Child extends Method_Overriding_Parent {

	void login() {

		System.out.println("Login with Mobile Number");
		super.login();

	}

	public static void main(String[] args) {
		Method_Overriding_Child c1 = new Method_Overriding_Child();
		c1.login();

	}

}
