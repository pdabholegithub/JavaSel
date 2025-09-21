package ab47;

class Amazon_Info {
	private String emailid = "contact@ne.com";

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	private String password = "contact@nepassword";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class Encapsulation_AmazonInfo {
	public static void main(String[] args) {

		Amazon_Info a1 = new Amazon_Info();
		a1.setEmailid("prasad@ne.com");
		System.out.println(a1);
		System.out.println(a1.getEmailid());
		a1.setPassword("Secret@password");
		System.out.println(a1);
		System.out.println(a1.getPassword());

	}

}
