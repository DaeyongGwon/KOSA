package fileandcharset.EX01;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File tempDir = new File("/Users/dae/Desktop/권대용");
		if(!tempDir.exists()) tempDir.mkdir();
		
		File file = new File("/Users/dae/Desktop/권대용");
		
		// 2. 파일 메서드
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("폴더(?) : " + file.isDirectory() );
		System.out.println("파일(?) : " + file.isFile());
		System.out.println("파일/폴더명 : " + file.getName());
		System.out.println("부모폴더 : " + file.getParent());
		
		File newfile1 = new File("/Users/dae/Desktop/권대용/abc");
		System.out.println(newfile1.mkdir());
		File newfile2 = new File("/Users/dae/Desktop/권대용/bcd/cde");
		System.out.println(newfile2.mkdir());
		System.out.println(newfile2.mkdirs());
		File[] fnames = file.listFiles();
		for(File fname: fnames) {
			System.out.println( (fname.isDirectory()? "폴더" : "파일: ") + fname.getName());
		}

	}
}
