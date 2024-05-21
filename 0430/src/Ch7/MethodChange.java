package Ch7;

public class MethodChange {
	public static void main(String[] args) {
		method1(1, 2);
		method1(1, 2, 3);
		method1();

		method2("안녕", "방가");
		method2("땡큐", "배리", "감사");
		method2();
	}

	public static void method1(int... values) {
		System.out.println("배열의 길이: " + values.length);

		for (int k : values) {
			System.out.println(k + " ");
		}

		System.out.println();
	}

	public static void method2(String... values) {
		System.out.println("배열의 이: " + values.length);

		for (String k : values) {
			System.out.println(k + " ");
		}

		System.out.println();
	}
}
