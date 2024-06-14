package fileandcharset.EX06;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToFormString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1. String getBytes(): String -> Byte[] 분해
		byte[] array1 = "안녕".getBytes();
		byte[] array2 = "땡큐".getBytes(Charset.defaultCharset());
		byte[] array3 = "베리".getBytes(Charset.forName("MS949"));
		byte[] array4 = "감사".getBytes(Charset.forName("UTF-8"));
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(array4.length);
		// 2. new String()을 이용: byte[] -> String 조합
		String str1 = new String(array1);
		String str2 = new String(array2, Charset.defaultCharset());
		String str3 = new String(array3, Charset.forName("MS949"));
		String str4 = new String(array4, "UTF-8");
		String str5 = new String(array3, "UTF-8");// MS949로 인코딩된 byte[]를 UTF-8로 디코딩하면 깨짐
		String str6 = new String(array4, "MS949");// UTF-8로 인코딩된 byte[]를 MS949로 디코딩하면 깨짐
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);	
	}
}
