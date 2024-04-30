package constructor;

class A1 {
	A1() {
		System.out.println("첫 번째 생성자");
	}

	A1(int a) {
		System.out.println("두 번째 생성자");
	}

	A1(int a, int b) {
		System.out.println("세 번째 생성자");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		A1 a2 = new A1(3);
		A1 a3 = new A1(3, 5);

	}
}
