package interface_02.EX04;

interface A {
	int a = 2;

	void abc();
}

class B implements A {
	public void abc() {
		System.out.println("방법 " + B.a + ". 자식 클래스 생성자로 객체 생성.");
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new B();

		b1.abc();
		b2.abc();
	}
}
