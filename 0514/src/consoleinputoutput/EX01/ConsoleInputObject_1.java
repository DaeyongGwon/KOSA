package consoleinputoutput.EX01;

import java.io.IOException;
import java.io.InputStream;
// 콘솔로 InputStream 사용하기 
// 콘솔 입력을 위한 System.in 활용과 available(), close() 메서드의 활
public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {
		// InputStream 객체 생성
		InputStream is = System.in;
		int data;
		while ((data = is.read()) != '\n' ) {
			System.out.println("읽은 데이터: " + (char) data + " 남은 바이트 수: " + is.available());
		}
		System.out.println("data: " + data);
		System.out.println(is.read());
	}
}
