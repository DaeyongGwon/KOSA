package method;

import java.util.Arrays;

public class MethodTest6 {
	public static void main(String[] args) {
		int[] n = { 1 };
		System.out.println("main : " + n[0]);

		// call by reference 값이 변하지 않는것
		// callByRef(Arrays.copyOf(n, n.length));
		
		int[] copy = new int[n.length];
		System.arraycopy(n, 0, copy, 0, n.length);
		callByRef(copy);
		System.out.println("main : " + n[0]);
		
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef : " + n[0]);
		n[0]++;
		System.out.println("callByRef : " + n[0]);
	}
}
