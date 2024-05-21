package 오버라이딩;

class A{
	void print() { 
		System.out.println("A 클래스");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}
public class MethodOverriding_1 {
	public static void main(String[] args) {
		A aa = new A();
		//A 클래스
		aa.print();
		
		B bb = new B();
		//B 클래스
		bb.print();
		
		A ab = new B();
		//B 클래스
		ab.print();
	}
}
