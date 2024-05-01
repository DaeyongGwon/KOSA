package 상속;


class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Polymorphism {
	public static void main(String[] args) {

		A a1 = new A();
		System.out.println(a1.toString());
		A a2 = new B();
		System.out.println(a2.toString());
		A a3 = new C();
		A a4 = new D();

//		B b1 = new A();
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();

//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
//		C b1 = new D();

//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();

	}

}
