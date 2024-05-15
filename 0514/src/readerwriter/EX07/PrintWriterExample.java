package readerwriter.EX07;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/readerwriter/files/";
		File printWriter1 = new File(fileLink + "printWriter1.data");
		File printWriter2 = new File(fileLink + "printWriter2.data");
		File printWriter3 = new File(fileLink + "printWriter3.data");
		// 1. PrinterWriter(File file)
		try (PrintWriter pw = new PrintWriter(printWriter1);) {
			pw.println("PrintWriter1 예제#1.");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}
		// 2. PrintWriter(OutputStream os)
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter2));) {
			pw.println("PrintWriter2 예제#2.");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}
		// 3. PrintWriter(Writer w)
		try (PrintWriter pw = new PrintWriter(new FileWriter(printWriter3));) {
			pw.println("PrintWriter3 예제#3.");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요! ");
			pw.println("반갑습니다.");
			pw.printf("%d", 7).printf("%s %f", "감사", 3.7);
		} catch (IOException e) {
		}
		// 4. PrintWriter(System.out)
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter4 예제#4.");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요! ");
		pw.println("반갑습니다.");
		pw.printf("%d", 7).printf("%s %f", "감사", 3.7);

	}
}
