package fileinputoutputstream.EX05;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.io.IOException;

public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException {
		// 1. 입력 파일 생성
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/fileinputoutputstream/files/";
		File outFile = new File(fileLink + "FileOutputStream2.txt");
		if(!outFile.exists()) outFile.createNewFile();
		// 2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, false);
		byte[] byteArray1 = "안녕하세요".getBytes("UTF-8");
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
		// 3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		os3.write(byteArray2, 6, 6);
		os3.flush();
		os3.close();
		
	}
}
