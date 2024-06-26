package fileinputoutputstream.EX04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0513/src/fileinputoutputstream/files/";
		File outFile = new File(fileLink + "FileOutputStream.txt");
		
		// 1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');
		os1.write('\n');
		os1.flush();
		os1.close();
		
		// 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArray1 = "Hello!".getBytes();
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "Better the last smile than the first laughter.".getBytes();
		os3.write(byteArray2, 7, 8);
		os3.flush();
		os3.close();
				
				
	}
}
