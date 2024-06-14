package threadstates.EX02;

class MyThread extends Thread {
	boolean yeildFlag;

	@Override
	public void run() {
		while (true) {
			if (yeildFlag) {
				Thread.yield();
			} else {
				System.out.println(getName() + " 실행");
				for (long i = 0; i < 99999999; i++) {
				}
			}
		}
	}
}

public class YieldInRunnableState {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yeildFlag = false;
		thread1.setDaemon(true);
		thread1.start();

		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yeildFlag = true;
		thread2.setDaemon(true);
		thread2.start();

		// 6초 지연(1초마다 한 번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			thread1.yeildFlag = !thread1.yeildFlag;
			thread2.yeildFlag = !thread2.yeildFlag;
		}
	}
}
