package default_;

interface AA {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class BB implements AA {
	public void abc() {
		AA.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMEthod_2 {
	public static void main(String[] args) {
		BB b = new BB();

		b.abc();
	}
}
