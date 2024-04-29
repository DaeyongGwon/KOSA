package method;

import java.util.Arrays;

public class MethodTest01 {
	public static void main(String[] args) {
		// 문자열 수정
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		// replace
		System.out.println(str1.replace("Study", "공부"));
		// substring
		System.out.println(str1.substring(0, 5));
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		// trim
		System.out.println("    abc    ".trim());
		System.out.println();
	}
}
