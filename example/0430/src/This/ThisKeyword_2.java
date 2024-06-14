package This;

class A2 {
	int m;
	int n;

	void init(int m, int n) {
		m = m;
		n = n;

	}
}

class B2 {
	int m;
	int n;

	void init(int m, int n) {
		this.m = m;
		this.n = n;

	}
}

public class ThisKeyword_2 {
	public static void main(String[] args) {

		A2 a = new A2();

		a.init(2, 3);
		System.out.println(a.m);
		System.out.println(a.n);
		
		B2 b = new B2();
		b.init(2, 3);
		System.out.println(b.m);
		System.out.println(b.n);
	}

}
