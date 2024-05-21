package lambdaexpression.EX02;

// 함수형 인터페이스의 객체를 생성하기 위한 람다식 표현 방법
interface A {
	void method1();

}

interface B {
	void method2(int a);

}

interface C {
	int method3();

}

interface D {
	double method4(int a, double b);

}

public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 X 리턴 X 함");
			}
		};

		// 1-2 람다식 표현
		A a2 = () -> {
			System.out.println("입력 X 리턴 X 함수");
		};
		A a3 = () -> System.out.println("입력 X 리턴 X 함수");

		// 2-1. 익명 이너 클래스 방식
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력 O 리턴 X 함수");
			}
		};

		// 2-2. 람다식 표현
		B b2 = (int a) -> {
			System.out.println("입력 O 리턴 X 함수");
		};
		B b3 = (a) -> System.out.println("입력 O 리턴 X 함수");
		B b4 = a -> System.out.println("입력 O 리턴 X 함수");

		// 3-1. 익명 이너 클래스 방식
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};

		// 3-2. 람다식 표현
		C c2 = () -> {
			return 4;
		};
		C c3 = () -> 4;

		// 4-1. 람다식 표현
		D d1 = (int a, double b) -> {
			return a + b;
		};
		D d2 = (a, b) -> {
			return a + b;
		};
		D d3 = (a, b) -> a + b;

	}
}
