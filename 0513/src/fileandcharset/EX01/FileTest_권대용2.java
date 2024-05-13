package fileandcharset.EX01;

import java.io.File;

public class FileTest_권대용 {

	public static void main(String[] args) {

		File devDir = new File("/Users/dae/Desktop/권대용/C/dev/file_test");
		if (!devDir.exists()) {
			devDir.mkdirs();
		}
		File file = new File("/Users/dae/Desktop/권대용/C/dev/file_test");
		
		// 파일 생성
		File file1 = new File("/Users/dae/Desktop/권대용/C/dev/file_test/0510.txt");
		File file2 = new File("/Users/dae/Desktop/권대용/C/dev/file_test/0511.txt");
		File file3 = new File("/Users/dae/Desktop/권대용/C/dev/file_test/0512.txt");
		File file4 = new File("/Users/dae/Desktop/권대용/C/dev/file_test/0513.txt");
		// 위 파일들이 존재한다면 생성안함
		if (!file1.exists()) {
			try {
				file1.createNewFile();
				file2.createNewFile();
				file3.createNewFile();
				file4.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 파일 생성완료 프린트
		System.out.println("파일 생성 완료");
		// 파일 목록 보기
		File[] files1 = file.listFiles();
		for (File f : files1) {
			System.out.println(f.getName());
		}
		
		// "/Users/dae/Desktop/권대용/C/dev/file_test" 파일들의 확장자 제거하기
		File[] files2 = file.listFiles();
		for (File f : files2) {
			String fileName = f.getName();
			int idx = fileName.lastIndexOf(".");
			String newFileName = fileName.substring(0, idx);
			System.out.println(newFileName);
		}
		
	}
}
