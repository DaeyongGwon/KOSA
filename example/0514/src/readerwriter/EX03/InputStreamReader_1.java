package readerwriter.EX03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputStreamReader_1 {
	public static void main(String[] args) {
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/readerwriter/files/";
		File InputStreamReader = new File(fileLink + "InputStreamReader.txt");
		
		// 1. FileReader를 이용한 파일 읽기
		try(Reader reader = new FileReader(InputStreamReader)){
			int data;
			while((data = reader.read()) != -1 ) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		System.out.println();
		// 2. FileInputStream + InputStreamReader를 이용한 파일 읽기
		try(InputStream is = new FileInputStream(InputStreamReader);
			java.io.InputStreamReader isr = new java.io.InputStreamReader(is, "MS949");){
			int data;
			while ((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println("\n" + isr.getEncoding());
			
		} catch (IOException e) {}

	}
}
