package fileandcharset.EX01;

import java.io.UnsupportedEncodingException;

public class EUC와MS949비교 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// EUC-KR vs MS949
		byte[] b1 = "a".getBytes("EUC-KR");
		byte[] b2 = "a".getBytes("MS949");
		System.out.println("EUC-KR : " + b1.length);
		System.out.println("MS949 : " + b2.length);
		System.out.println(new String(b1, "EUC-KR"));
		System.out.println(new String(b2, "MS949"));
		
		byte[] b3 = "가".getBytes("EUC-KR");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println("EUC-KR : " + b3.length);
		System.out.println("MS949 : " + b4.length);
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		
		byte[] b5 = "봵".getBytes("EUC-KR");
		byte[] b6 = "봵".getBytes("MS949");
		System.out.println("EUC-KR : " + b5.length);
		System.out.println("MS949 : " + b6.length);
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));
		System.out.println();
	}
}
