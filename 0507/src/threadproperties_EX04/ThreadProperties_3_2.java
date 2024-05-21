package threadproperties_EX04;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(getName() + ": " + (isDaemon() ? "데몬 쓰레드" : "일반 쓰레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + ": " + i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] args) {
		
//		// 일반 쓰레드
//		Thread thread1 = new MyThread();
//		thread1.setDaemon(false);
//		thread1.setName("thread1");
//		thread1.start();
		
		// 데몬 쓰레드
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		// 트렌젝션 -> 데이터베이스의 상태를 변화시키기 위해 수행하는 작업의 최소 단위를 의미한다.
		
		// 3.5초 후 메인쓰레드 종
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 쓰레드 종료");
	}
}
