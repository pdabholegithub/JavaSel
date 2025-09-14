package ab47;

public class SyncExample {
	public synchronized void printNumbers() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

class TestSync {
	public static void main(String[] args) throws InterruptedException {
		SyncExample obj = new SyncExample();

		Thread t1 = new Thread(() -> obj.printNumbers());
		Thread t2 = new Thread(() -> obj.printNumbers());

		t1.start();
		t2.start();

		// Make sure main waits for both threads
		t1.join();
		t2.join();

		System.out.println("Main Finished");
	}
}
