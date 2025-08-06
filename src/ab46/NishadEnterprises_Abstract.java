package ab46;

abstract class Google_Auth {
	abstract void login();// abstract methods

	abstract void registration(); // abstract methods
}

public class NishadEnterprises_Abstract extends Google_Auth {

	void login() // concrete methods
	{
		System.out.println("This is concrete method for login");

	}

	void registration() // concrete methods
	{
		System.out.println("This is concrete method for registration");

	}

	public static void main(String[] args) // concrete methods
	{
		NishadEnterprises_Abstract nea = new NishadEnterprises_Abstract();
		nea.login();
		nea.registration();

	}

}
