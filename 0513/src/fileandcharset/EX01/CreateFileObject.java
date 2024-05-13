package fileandcharset.EX01;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {
	public static void main(String[] args) throws Exception {
		// 1-1. 바탕화면 내에 temp폴더가 없을 때 생성
		File tempDir = new File("/Users/dae/Desktop/권대용");
		if(!tempDir.exists()) tempDir.mkdir();
		System.out.println(tempDir.exists());
		
		// 1-2. 파일 객체 생성(실제 파일 생성)
		File newFile = new File("/Users/dae/Desktop/권대용/newFile.txt");
		if(!newFile.exists()) newFile.createNewFile(); // temp 폴더가 없을 때 예외 발생
		System.out.println(newFile.exists());
		System.out.println();
		
		// 2. 파일 구분자
		File newFile2 = new File("/Users/dae/Desktop/권대용/newFile2.txt");
		
		// 3-1. 절대 경로
		File newFile5 = new File("/Users/dae/Desktop/권대용/abc/newFile.txt");
		File newFile6 = new File("/Users/dae/Desktop/권대용/abc/bcd/newFile.txt");
		System.out.println(newFile5.getAbsolutePath());
		System.out.println(newFile6.getAbsolutePath());
		
		// 3-2. 상대 경로
		//현재 위치
		System.out.println(System.getProperty("user.dir"));
		File newFile7 = new File("newfile1.txt");
		File newFile8 = new File("bcd/newFile2,txt");
		System.out.println(newFile7.getAbsolutePath());
		System.out.println(newFile8.getAbsolutePath());
	}
}
