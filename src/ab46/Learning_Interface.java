package ab46;

interface Amazon1 {
	void login();

	void registration();

}

public class Learning_Interface implements Amazon1 {

	public static void main(String[] args) {

		Learning_Interface li = new Learning_Interface();
		li.login();
		li.registration();

	}

	public void login() {

		System.out.println("Real logic of Login");
	}

	public void registration() {

		System.out.println("Real logic of Registration");
	}

}
