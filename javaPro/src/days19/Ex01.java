package days19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) {
		// 6. 학생명단.txt  파일을 읽어서 출력.
//			ㄱ. try~with~resources 문 사용
//			ㄴ. FileReader 만 사용 ( BufferedReader X )
//			ㄷ.  앞에 LineNumber 붙이기 

		
		String fileName = "C:\\Users\\user\\Documents\\카카오톡 받은 파일\\복습문제\\학생명단.txt";
		int lineNumber = 1;
		int one ;
		
			try (FileReader reader = new FileReader(fileName)){
				System.out.printf("%d : ", lineNumber++);
				
				while ((one = reader.read())!= -1) {
					System.out.printf("%c", (char)one);
					
					if (one == 10) {
					System.out.printf("%d :",lineNumber++);
				} // if
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			} //  while
			System.out.println("\nend");
				

	} // main

} // class
