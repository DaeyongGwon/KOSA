package method;

public class MethodTest02 {
	public static void main(String[] args) {
		int dice = getDice();
		
		System.out.println("주사위는 : " + dice);
	}
	private static int getDice() {
		return (int) (Math.random() * 6) + 1;
	}
}