package staticmodifier;

class A {
	int m = 3;
	static int n = 5;
	
}

public class StaticField_1 {
	public static void main(String[] args) {
		// 인스턴스 필드 활용 방법(객체를 생성한 수 사용 가능)
		A a1 = new A();
		System.out.println(a1.m);
		
		// 정적 필드 활용 방법
		// 1. 객체 생성 없이클래스 명으로 바로 활용
		System.out.println(A.n);
		
		// 2. 객체를 생성한 후 활용(권장하지 않음)
		A a2 = new A();
		System.out.println(a2.n);
	}
}
