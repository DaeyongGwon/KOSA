package readerwriter.EX01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
// FileReaderdhk FileWriter를 이용한 char 단위의 파일 입출력 구현
public class FileReaderWriter {
	public static void main(String[] args) {
		// 파일 객체 생성
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/readerwriter/files/";
		File readerwriterFile = new File(fileLink + "WriterFile.txt");
		
		// 1. FileWriter를 이용한 파일 쓰기(UTF-8모드)
		try(Writer writer = new FileWriter(readerwriterFile)) {
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\n');
			writer.write("반갑습니다.", 2, 3);
			writer.flush();
		} catch (IOException e) {}
		
		// 2. FileReader를 이용한 파일 읽기(UTF-8 모드)
		try (Reader reader = new FileReader(readerwriterFile)) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {}
		
	}
}
