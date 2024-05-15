package readerwriter.EX06;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_2 {
	public static void main(String[] args) {
		// 1. 콘솔 출력 1(기본값: UTF-8 -> UTF-8)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter를 이용한.\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n한글과 영문이 모두 포함돼 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {}
		
		// 2. 콘솔 출력 2(기본값: UTF-8 -> MS949)
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter를 이용한.\n".toCharArray());
			osw.write("콘솔 출력 예제입니다. \n한글과 영문이 모두 포함돼 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n");
			osw.flush();
			System.out.println(osw.getEncoding());
		} catch (IOException e) {}
		System.out.println();
	}
}
