package threadstates.EX05;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2); // 동시에 최대 2개의 스레드만 접근 허용

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> accessResource());
        Thread t2 = new Thread(() -> accessResource());
        Thread t3 = new Thread(() -> accessResource());

        t1.start();
        t2.start();
        t3.start();
    }
    // 세마포어는 동시에 접근할 수 있는 스레드의 개수를 제한하는 동기화 기법
    private static void accessResource() {
        try {
            semaphore.acquire(); // 세마포어 획득 시도
            System.out.println(Thread.currentThread().getName() + " is accessing the resource");
            Thread.sleep(1000); // 자원 사용을 시뮬레이션
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // 세마포어 반환
            System.out.println(Thread.currentThread().getName() + " is releasing the resource");
        }
    }
}