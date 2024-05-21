package insanceinnerclass;

class A {
	int a = 3;
	static int b = 4;

	void method1() {
		System.out.println("instance method");
	}

	static void method2() {
		System.out.println("static method");
	}

	// 정적 이너 클래스 
	static class B {
		void bcd() {

			// use field
			// System.out.println(a);
			System.out.println(b);
			// call method
			// method1();
			method2();
		}
	}
}
public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		A.B b = new A.B();
		b.bcd();
	}

}
