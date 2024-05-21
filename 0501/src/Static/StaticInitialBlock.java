package Static;

class A2 {
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("클래스 A2가 로딩됐습니다!!!");
	}

	A2() {
		a = 3;
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A2.b);
	}
}
