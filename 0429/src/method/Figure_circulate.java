import java.util.Scanner;

public class Figure_circulate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원 2.사각형 3.삼각형 > ");
		int shape = sc.nextInt();
		circulator(shape, sc);
		sc.close();

	}

	private static void circulator(int shape, Scanner sc) {
		System.out.println((shape == 1 ? "원" : 
							shape == 2 ? "사각형" : "삼각형") + "의 넓이를 계산합니다.");
		double area = 0;
		switch (shape) {
		case 1: 
			System.out.println("원의 넓이는 " + circleArea(sc) + "입니다."); break;
		
		case 2: {
			System.out.println("사각형의 넓이는 " + rectangleArea(sc) + "입니다."); break;
		}
		case 3: {
			System.out.println("삼각형의 넓이는 " + triangleArea(sc) + "입니다."); break;
		}
		default:
			System.out.println("1~3의 숫자를 입력해주세요"); break;
		}

	}

	private static double circleArea(Scanner sc) {
		System.out.printf("반지름을 입력하세요 > ");
		int radious = sc.nextInt();
		return radious * radious * 3.14;
	}

	private static double rectangleArea(Scanner sc) {
		System.out.printf("가로 길이를 입력하세요 > ");
		int n1 = sc.nextInt();
		System.out.printf("세로 길이를 입력하세요 > ");
		int n2 = sc.nextInt();
		return n1 * n2;
	}

	private static double triangleArea(Scanner sc) {
		System.out.printf("밑변 길이를 입력하세요 > ");
		int n1 = sc.nextInt();
		System.out.printf("높이 길이를 입력하세요 > ");
		int n2 = sc.nextInt();
		return n1 * n2 * 0.5;
	}
}
