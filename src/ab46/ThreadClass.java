package ab46;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i < 10; i++) {
			System.out.println(Math.random());
			Thread.sleep(1000);
		}
	}

}
