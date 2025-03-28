package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 2. 28. - 오후 5:10:31
 * @subject
 * @content		Date, Calendar <- 출력형식의 문자열 변환
 */
public class Ex11_02 {

	public static void main(String[] args) {
		// 날짜 형식의 문자열 s를 Date, Calendar 날짜 클래스로 변환	.
		// format, parse
		
		String s = "2025.02.28(금)";
		
		//[2] SimpleDateFormat
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d = sdf.parse(s);
			System.out.println(d.toLocaleString());
			//[해보기] Date -> calendar 변환
			Calendar c = Calendar.getInstance();
			c.setTime(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*[1]
		int year = Integer.parseInt(s.substring(0, 4));
		int month = Integer.parseInt(s.substring(5,7));
		int date = Integer.parseInt(s.substring(8,10));
		
		//Date d = new Date(year-1900, month-1, date);
		*/
		
		
	} // main

} // class
