package method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest8 {
	// 입력을 받을 때 Scanner를 사용.
	public static void main(String[] args) {

		System.out.print("난 누구냐? 내 이름을 말해봐!! > ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		say(name);
	}

	private static void say(String name) {
		switch (name) {
		case "정대만":
			System.out.println("그래, 난 " + name + ". 포기를 모르는 남자지.");
			break;
		case "서태웅":
			System.out.println("내가 북산을 최고의 팀으로 만든다.");
			break;
		case "채치수":
			System.out.println("전국 재패~!!");
			break;
		case "강백호":
			System.out.println("난 천재니까!");
			break;
		case "송태섭":
			System.out.println("넘버1 가드!");
			break;
		default:
			System.out.println("우리들은 강하다~!!");
		}

	}

}
