package ab47;

public class NonSyncExample {
	public void printNumbers() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class TestNonSync {
	public static void main(String[] args) {
		NonSyncExample obj = new NonSyncExample();

		Thread t1 = new Thread(() -> obj.printNumbers());
		Thread t2 = new Thread(() -> obj.printNumbers());

		t1.start();
		t2.start();
	}
}
