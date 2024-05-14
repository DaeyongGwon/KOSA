package filterinputoutputstream.EX01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// BufferedInputStream과 OutStream을 이용해 속도 향상시키
public class BufferedInputOutputStream {
	public static void main(String[] args) {
		String fileLink = "/Users/dae/Desktop/Java/workspace/KOSA/0514/src/filterinputoutputstream/files/";
		File orgfile = new File(fileLink + "mycat_origin.jpg");
		File copyfile1 = new File(fileLink + "mycat_copy1.jpg");
		File copyfile2 = new File(fileLink + "mycat_copy2.jpg");
		long start, end, time1, time2;
		// 1. BufferedInputStream, BufferedOutputStream을 사용하지 않을 때
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile); OutputStream os = new FileOutputStream(copyfile1);) {
			// 복사하는 코드
			int data;
			while ((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream: " + time1);

		// 2. BufferedInputStream, BufferedOutputStream을 사용했을 때
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);) {

			// 복사하는 코드
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream: " + time2);
		// 사용했을 때와 사용하지 않았을 때 비교
		System.out.println("Ratio of with and without: " + time1/time2);
	}
}
