package days25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 10:24:33
 * @subject exe 파일(실행파일) 복사
 * @content	문자 스트림으로 X
 * 			바이트 스트림 O (vkdlf)
 * 			FileInputStream/
 * 			Buffered -
 */
public class Ex02 {

	public static void main(String[] args) {
		String fileName = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFileName = ".\\copyBandizip.exe";

		// >처리시간: 13287942599 ns
		fileCopy_byteStream(fileName, copyFileName); // 파일 복사 메서드

		System.out.println("end");

	} // main

	private static void fileCopy_byteStream(String source, String target) {
		
		long start = System.nanoTime();

		int code;
		try (FileInputStream reader = new FileInputStream(source);
			FileOutputStream writer = new FileOutputStream(target);){

			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
				writer.write(code);// 디스크에 쓰기 x /스트림에 쓰기작업. 다 차면 자동 flush-> 수동 flush (작업끝내기), 남은거 밀어냄 / 
			} //  while
			writer.flush(); 

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();

		System.out.printf(">처리시간: %d ns\n", end-start);

	}

} // class
