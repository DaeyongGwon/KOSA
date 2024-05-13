package fileinputoutputstream.EX01;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		// 입력 파일 생성
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0513/src/fileinputoutputstream/files/";
		File inFile = new File(fileLink + "FileInputSteam.txt");
		// InputSteam 객체 생성
		InputStream is = new FileInputStream(inFile);
		int data;
		while ((data = is.read()) != -1	) {
			System.out.println("읽은 데이터: " + (char)data + "|남은 바이트 수: " + is.available());
		}
		// InputSteam 자원 반납
		is.close();
		
	}
}
