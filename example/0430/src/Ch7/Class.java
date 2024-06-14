package Ch7;

class B {
	void print() {
		System.out.println("안녕");
	}

	int data() {
		return 3;
	}

	double sum(int a, double b) {
		return a + b;
	}

	void printMonth(int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월입니다.");
	}
}

public class Class {
	public static void main(String[] args) {
		B b = new B();

		b.print();
		int k = b.data();
		b.data();
		System.out.println(k);
		double result = b.sum(3, 5.2);
		System.out.println(result);
		b.printMonth(5);
		b.printMonth(15);

	}
}
