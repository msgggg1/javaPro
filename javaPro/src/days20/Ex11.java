package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 2. 28. - 오후 4:41:42
 * @subject 2. SimpleDateFormat 클래스
 * @content		ㄴ Date, Calendar 객체를 원하는 날짜 형식으로 출력할 때
 * 				  사용하는 형식화 클래스이다. 
 * 
 * 				Date, Calendar -> 출력형식의 문자열 변환
 */
public class Ex11 {

	public static void main(String[] args) {
		
		//[1]
		Date d = new Date();
//		System.out.println(d.toLocaleString());
		
		
		//2025/02/28 04:48:00 금요일
//		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(d));
		
		
		//[2] calendar -> Date 변환 시킨 후 형식화 클래스 사용 
//		Calendar c = Calendar.getInstance()	;
////		d = c.getTime();
//		String pattern = "yyyy/MM/dd hh:mm:ss E요일";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(c.getTime()));

		//[3] 문제 : SimpleDateFormat 아래와 같은 형식으로 출력하는 코딩
		//		2025년 2월 28일 오후 5:04:25 금요일
		Calendar c = Calendar.getInstance()	;
		String pattern ="yyyy년 M월 dd일 a h:mm:ss E요일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
	} // main

} // class
