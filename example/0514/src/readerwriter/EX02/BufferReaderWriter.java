package readerwriter.EX02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferReaderWriter {
	// 파일 객체 생성
	public static void main(String[] args) {
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/readerwriter/files/";
		File readerWriterFile = new File(fileLink + "BufferedFile.txt");

		// 1. FileWriter를 이용한 파일 쓰기
		try (Writer writer = new FileWriter(readerWriterFile); BufferedWriter bw = new BufferedWriter(writer);) {
			bw.write("안녕하세요\n".toCharArray());
			bw.write("Hello");
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
		} catch (Exception e) {

		}
		// 2. FileReader를 이용한 파일 읽기
		try (Reader reader = new FileReader(readerWriterFile); BufferedReader br = new BufferedReader(reader);) {
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}

		} catch (Exception e) {

		}
	}
}
