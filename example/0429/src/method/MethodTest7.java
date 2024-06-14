package method;

import java.util.Arrays;

public class MethodTest7 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(1,2,3);
	}

	private static void print(int... i) {
//		for(int j = 0; j <i.length; j++) {
//			System.out.print(i[j] + " ");
//		}
//		System.out.println();
		for(int n: i) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
