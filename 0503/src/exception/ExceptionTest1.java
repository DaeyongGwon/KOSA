package exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());
			System.out.println("try 종료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
