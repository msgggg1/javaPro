package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 3:31:25
 * @subject 자동 자원 반환 (try ~with ~ resources 문) 설명
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
		
	
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		int one;
		int lineNumber = 1;
		
		try ( FileReader reader = new FileReader(fileName)) {
			System.out.printf("%d : ",lineNumber++);
			while ((one=reader.read()) != -1) {
				System.out.printf("%c",(char)one);	
				if (one == 10 ) {
					System.out.printf("%d : ",lineNumber++);
					// 13('\r'), 10('\n') 개행
					// (char)one == '\n'
				} // if
			} //  while 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			
		}
		
		System.out.println("end");
		
		
	} // main

} // class
