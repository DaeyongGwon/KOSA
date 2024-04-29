package method;

public class MethodTest5 {
	public static void main(String[] args) {
		int[] n = { 1 };
		System.out.println("main : " + n[0]);
		
		// call by reference
		callByRef(n);
		System.out.println("main : " + n[0]);
		System.out.println();
	}

	private static void callByRef(int[] n) {
		System.out.println("callByRef : " + n[0]);
		n[0]++;
		System.out.println("callByRef : " + n[0]);
	}
}
