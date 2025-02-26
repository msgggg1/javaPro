package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 3:31:25
 * @subject 자동 자원 반환 try ~with ~ resources 문 설명
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		//"days17.16일차복습_홍길동.txt" 텍스트 파일을 읽어와서 출력
		// FileReader 파일 읽기 클래스 *** 객체 생성
		// FileWriter 파일 쓰기 클래스 
		
		FileReader reader = null ;
		String fileName = "C:\\Class\\JavaClass\\javaPro\\src\\days17\\16일차복습_홍길동.txt";
		int one;
		try {
			reader = new FileReader(fileName);// 생성자 예외처리 붙어있음 / 사용한 파일 반드시 닫아줘야 x -> 읽기전용
			//one = reader.read();
			//System.out.println(one);
			while ((one=reader.read()) != -1) {
				System.out.printf("%c",(char)one);
			} //  while
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
		
		
	} // main

} // class
