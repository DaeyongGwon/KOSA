package Ch;

class A2 {
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A2 a = new A2();
		
		a.m = 5;
		System.out.println(a.m);
		
		a.print();
	}
}
