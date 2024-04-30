package object;

class A {
	int m = 3;

	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// 클래스로 객체(붕어빵) 생
		A a = new A();

		// 클래스 멤버 활용(붕어빵 먹기)
		a.m = 5;
		System.out.println(a.m);

		a.print();
	}
}
