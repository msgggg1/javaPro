package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 9:01:21
 * @subject BufferedReader / BufferedWriter 보조 스트림을 사용해서 복사
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days24\\Ex01.java"; // 복사할 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 복사할 곳의 파일명
		
		// >처리시간: 7112600 ns(10^-9)
		// >처리시간:  981200 ns
		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드
		
		System.out.println("end");
		
		
	} // main

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024; // 임의
		
		int code;
		try (FileReader reader = new FileReader(source);
			FileWriter writer = new FileWriter(target);
			BufferedReader br = new BufferedReader(reader, BUFFER_SIZE); // size만큼 한번에 읽고 옮김
			BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE); // stream객체가 매개변수로 들어감. stream객체 쉽게 다룰수있는 기능이 구현된 보조스트림객체
				){
			
			/*//[1]
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line+\r\n); // 개행 안들어감. 
			} //  while
			*/
			
			//[2] 버퍼크기만큼 읽어오고 쓰기 ***
			// 1024 -> 1030 -> 1024+6 / 리턴값: 읽어온 개수
			char [] cbuf = new char [BUFFER_SIZE];
			int n  = -1; // 실제 읽어온 문자 수 
			while ((n = br.read(cbuf)) != -1) { // cbuf 읽어온 것 저장하는 곳(저장공간)
				bw.write(cbuf, 0, n);
			} //  while
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf(">처리시간: %d ns\n", end-start);
		
	}

} // class
