package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
public class Ex02_02 {

	public static void main(String[] args) {
		String fileName = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFileName = ".\\copyBandizip.exe";

		// >처리시간: 13287942599 ns
		// >처리시간: 11329917200 ns
		fileCopy_byteStream(fileName, copyFileName); // 파일 복사 메서드

		System.out.println("end");

	} // main

	private static void fileCopy_byteStream(String source, String target) {
		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		int code;
		try (FileInputStream reader = new FileInputStream(source);
			FileOutputStream writer = new FileOutputStream(target);
			BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE);
			BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)){

			byte [] b = new byte [BUFFER_SIZE];
			int n= -1; // 읽어온 바이트 수 저장할 변수
			while ((n = bis.read(null))!=-1) {
				bos.write(b,0,n);
			} //  while

			bos.flush();
				
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();

		System.out.printf(">처리시간: %d ns\n", end-start);

	}

} // class
