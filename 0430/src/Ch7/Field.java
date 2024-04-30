package Ch7;

class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalVirable() {
		int k;
	}
	
}


	public class Field {
	public static void main(String[] args) {
		A a = new A();
		a.printFieldValue();
	}
}
