package method;

public class MethodTest4 {
	public static void main(String[] args) {
		int a = 7, b = 4;
		int c = add(a, b);	// call by value
		System.out.println(c);
		
	}

	// 메서드
	private static int add(int a, int b) {
		int c = a + b;
		a++;
		System.out.println("add.a : " + a);
		return c;
	}

}