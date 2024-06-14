package fileandcharset.EX01;

import java.io.File;
import java.io.IOException;

public class FileTest_권대용 {

	public static void main(String[] args) throws IOException {
		String fileLink = "/Users/dae/Desktop/권대용/C/dev/file_test/";
		File devDir = new File(fileLink);
		if (!devDir.exists()) {
			devDir.mkdirs();
		}
		File file = new File(fileLink);

		// 파일 생성
		File file1 = new File(fileLink + "0510.txt");
		File file2 = new File(fileLink + "0511.txt");
		File file3 = new File(fileLink + "0512.txt");
		File file4 = new File(fileLink + "0513.txt");
		File[] files = { file1, file2, file3, file4 };
		for (File f : files) {
			f.createNewFile();
			System.out.println("생성된 파일명 : " + f.getName());
		}

		File[] files2 = file.listFiles();
		for (File f : files2) {
			String name = f.getName();
			String newName = name.substring(0, name.lastIndexOf("."));
			f.renameTo(new File(fileLink + newName));
			System.out.println("새로운 파일명 : " + newName);
		}
	}
}
