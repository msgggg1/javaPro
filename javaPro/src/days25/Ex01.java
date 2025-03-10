package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 9:01:21
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/* 단톡방 사진 참고
		 * 1. 스트림
		 * 2. 2가지 종류 : 문자, 바이트 스트림
		 * 3. 보조스트림 
		 * 
		 * 문자(텍스트) 스트림		=> 파일 복사
		 * FileReader/FileWriter
		 *  + 
		 * File 클래스: 파일, 디렉토리(폴더)를 
		 * 				다루는(생성, 삭제, 수정, 정보 얻어오기 등) 클래스.
		 * */
		
		//[1]
//		String pathname = ".\\src\\days24\\Ex01.java";
//		File f  = new File(pathname);

		// 파일? 폴더?
//		System.out.println(f.isDirectory()); // false // true
//		System.out.println(f.isFile()); // true // false
		
//		System.out.println(f.length()); // long ->  파일 크기 2252[bytes]
		
		//[2]
		String parent = ".\\src\\days24"; // 디렉토리
		String child = "Ex01.java"; // 파일명
		File f = new File(parent, child);
		
		System.out.println(f.lastModified()); // 마지막 수정된 날짜 (long)	
		Date d = new Date(f.lastModified());
		System.out.println(d.toLocaleString());
		// 날짜 -> 형식화 클래스 사용. (복습하기)
		
		int code;
		try (FileReader reader = new FileReader(f)){
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			} //  while
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	} // main

} // class
