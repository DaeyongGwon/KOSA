package innerinterface;

class MyDice {
	public int getNumber() {
		return (int) (Math.random() * 6) + 1;
	}
}

public class ThreadTest extends MyDice implements Runnable {

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread nt = new Thread(t);
		nt.start();

		for (int i = 1; i <= t.getNumber(); i++) {
			System.out.println("main : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}

	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}
}
