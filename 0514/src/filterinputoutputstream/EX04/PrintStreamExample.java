package filterinputoutputstream.EX04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 파일 생성
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/fileinputoutputstream/files/";
		File outFile1 = new File(fileLink + "Stream1.txt");
		// 파일 생성
		File outFile2 = new File(fileLink + "Stream2.txt");
		// 1. PrintStream(FileOutputStream(File))
		try (OutputStream os1 = new FileOutputStream(outFile1); PrintStream ps = new PrintStream(os1);) {
			ps.println(5.8);
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch (IOException e) {
		}

		// 2. PrintStream(File)
		try (PrintStream ps = new PrintStream(outFile2);) {
			ps.println(5.8);
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch (IOException e) {
		}

		// 3. PrintStream ps = System.out
		try (OutputStream os2 = System.out; PrintStream ps = new PrintStream(os2);) {
			ps.println(5.8);
			ps.print(3 + "안녕" + 12345 + "\n");
			ps.printf("%d", 7).printf("%s %f", "안녕", 5.8);
			ps.println();
		} catch (IOException e) {
		}

	}
}
