package genericmethod.EX02;

class A {
	public <T> void method(T t) {
		System.out.println(t.equals("안녕"));
	}
}
public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method("안녕");
	}
}
