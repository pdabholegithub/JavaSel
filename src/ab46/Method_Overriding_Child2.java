package ab46;

class Method_Overriding_Parent1 {
	void login() {
		System.out.println("Login with Email ID");
	}

}

public class Method_Overriding_Child2 extends Method_Overriding_Parent1 {

	void login() {
		super.login();
		System.out.println("Login with Mobile Number");
		

	}

	public static void main(String[] args) {
		Method_Overriding_Child2 c1 = new Method_Overriding_Child2();
		c1.login();

	}

}
