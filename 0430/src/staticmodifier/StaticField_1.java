package staticmodifier;

class A {
	int m = 3;
	static int n = 5;

}

public class StaticField_1 {
	public static void main(String[] args) {
		// 인스턴스 필드 활용 방법(객체를 생성한 수 사용 가능)
		A a1 = new A();
		A a2 = new A();

		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);

		a1.n = 7;
		a2.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);

		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		// 정적 필드 활용 방법
		// 1. 객체 생성 없이클래스 명으로 바로 활용
	}
}
