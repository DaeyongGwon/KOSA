package synchronizedmethod;

class MyData {
	int data = 3;
	public synchronized void plusData() {
		int mydata = data;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

// 공유 객체를 사용하는 쓰레드
class PlusThread extends Thread {
	MyData myData;

	public PlusThread(MyData data) {
		this.myData = data;
	}

	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + " 3실행 결과: " + myData.data);
	}
}

public class SynchronizedMethod {
	public static void main(String[] args) {
		//공유 객체 생성
		MyData data = new MyData();
		
		// plusThread 1
		Thread plusThread1 = new PlusThread(data);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// plusThread 2
		Thread plusThread2 = new PlusThread(data);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
