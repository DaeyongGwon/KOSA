package readerwriter.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {
		// 1. FilterWriter를 이용해 데이터 쓰기(기본값 (UTF-8))
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/readerwriter/files/";
		File outputStreamWriter1 = new File(fileLink + "OutputStreamWriter1.data");
		
		try(Writer writer = new FileWriter(outputStreamWriter1);){
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함돼 있습니다.");
			writer.write('\n');
			writer.write("Good Bye!!!\n\n");
			writer.flush();
			
		}catch (IOException e) {}
		
		// 2. FileWriter 이용해 데이터 쓰기(기본값(UTF-8) -> MS949 파일 생성)
		File outputStreamWriter2 = new File(fileLink + "OutputStreamWriter2.data");
		try(OutputStream os = new FileOutputStream(outputStreamWriter2, false);
			OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");)
		{
			osw.write("OutputStreamWriter2 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함돼 있습니다.");
			osw.write('\n');
			osw.write("Good Bye!!!\n\n");
			osw.flush();
			
		}catch (IOException e) {}
	}
}
