package days25;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 9:01:21
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days24\\Ex01.java"; // 복사할 원본 파일
		String copyFileName = ".\\src\\days24\\CopyEx01.java"; // 복사할 곳의 파일명
		
		// >처리시간: 7112600 ns(10^-9)
		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드
		
		//클래스명변경(copyFileName);
		
		System.out.println("end");
		
		
	} // main

	private static void 클래스명변경(String copyFileName) {
		StringBuilder sb = new StringBuilder();
		int code;
		try (FileReader reader  = new FileReader(copyFileName)){
			
			while ( (code = reader.read() ) != -1  ) {
				 sb.append((char)code) ;
			} // while
			
			//System.out.println( sb.toString() );
			
			Pattern pattern = Pattern.compile("Ex01");
			Matcher matcher = pattern.matcher(sb.toString());
			
			if (matcher.find()) {
				System.out.println( matcher.group() );
				System.out.printf("start:%d ~ end:%d\n", matcher.start()
						, matcher.end());
				matcher.appendReplacement(sb, "CopyEx01");
			} // if
			matcher.appendTail(sb);
			
			System.out.println(sb.toString());
			
			// 파일 덮어쓰기 추가...
		} catch (Exception e) {
			System.out.println( e.toString() );
		} // 
		
	}
	
	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();
		
		
		int code;
		try (FileReader reader = new FileReader(source);
			FileWriter writer = new FileWriter(target);){
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
				writer.write(code);// 디스크에 쓰기 x /스트림에 쓰기작업. 다 차면 자동 flush-> 수동 flush (작업끝내기), 남은거 밀어냄 / 
			} //  while
			writer.flush(); 
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		long end = System.nanoTime();
		
		System.out.printf("> 처리시간: %d ns\n", end-start);
		
	}

} // class
