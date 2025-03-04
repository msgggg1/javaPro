package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 3:06:47
 * @subject		형식화 클래스 = 4가지. 
 * @content		java.time.format패키지
 * 					ㄴ 날짜 다루는 형식화 클래스 있다.
 * 					ㄴ DateTimeFormatter 형식화 클래스
 * 						날짜와 시간을 형식화해서 출력
 * 					ㄴ 날짜 객체 -> 원하는 형식으로 변환
 */
public class Ex08 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		// 2025-03-04
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
		// 20250304
		System.out.println(dt.format(DateTimeFormatter.BASIC_ISO_DATE));

		// 2025/03/04 화요일 15:16:45.123 // 내가 원하는 형태로 출력 하고싶을때
		//[1]
//		String pattern = "yyyy/MM/dd E요일 HH:mm:ss.SSS";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		String s = dtf.format(dt);
//		System.out.println(s);
		
		// FULL 2025년 3월 4일 화요일
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String s = dtf.format(dt);
		System.out.println(s);
		// LONG
		// MEDIUM
		// SHORT
		
	} // main

} // class
