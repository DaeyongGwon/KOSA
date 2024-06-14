package exception;

import java.io.IOException;

public class ExceptionTest3 {
	public static void main(String[] args) {
		try {
			runMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void runMethod() throws Exception {
		throw new IOException("파일처리 예외상황 발생~!!");

	}
}
