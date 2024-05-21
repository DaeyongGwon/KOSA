package anomyous;

interface A {
	public abstract void abc();
}

class B implements A {
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnoomymousClass {
	public static void main(String[] args) {
		C c = new C();
		// 방법 1. 클래스명 O 참조 변수명 O
		A a = new B();
		c.cde(a);
		// 방법 2. 클래스명 O 참조 변수명 X
		c.cde(new B());
		
		// 방법 3. 클래스명 X 참조 변수명 O
		A aa = new A() {
			public void abc() {
				System.out.println("입력매개변수 전달1");
			}
		};
		c.cde(aa);
		
		// 방법 4. 클래스명 X 참조 변수명 X
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달2");
			}
		});
	}
}
