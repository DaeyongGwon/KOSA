package method;

import java.util.Scanner;

public class MethodTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력 > ");
		int you = sc.nextInt();

		int com = (int) (Math.random() * 3) + 1;

		System.out.println("YOU: " + caption(you));
		System.out.println("COM: " + caption(com));
		System.out.println(getMessage(you, com));

	}

	private static String caption(int value) {
		return (value == 1 ? "가위" : value == 2 ? "바위" : "보");
	}

	private static String getMessage(int you, int com) {
		if (you == com)
			return "무승부 입니다.";
		else if (you == 1 && com == 3 || you == 2 && com == 1 || you == 3 && com == 2)
			return "당신이 이겼습니다.";
		else
			return "컴퓨터가 이겼습니다.";

	}

}
