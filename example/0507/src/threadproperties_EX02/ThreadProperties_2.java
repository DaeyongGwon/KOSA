package threadproperties_EX02;

class MyThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 9_860_000_000L; i++) {
		}
		System.out.println(getName() + " 우선순위: " + getPriority());
	}
}

public class ThreadProperties_2 {
	// CPU 코어 수
	public static void main(String[] args) {
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());

		// 우선순위 자동 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}

		// 우선순위 직접 지정
		for (int i = 0; i < 12; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if (i == 11)
				thread.setPriority(10);
			thread.start();
		}
	}
}
