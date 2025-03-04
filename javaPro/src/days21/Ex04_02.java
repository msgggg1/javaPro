package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author msg
 * @date 2025. 3. 4. - 오전 11:51:41
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		//2. java.time.LocalTime 클래스
		LocalTime t = LocalTime.now();
		System.out.println(t); // 12:03:25.940765700
		//시
//		t.get(ChronoField.HOUR_OF_DAY);
		int hour = t.getHour();
		System.out.println(hour);
		//분
//		int minute = t.get(ChronoField.MINUTE_OF_HOUR);
		int minute = t.getMinute();
		System.out.println(minute);
		//초
//		int second = t.get(ChronoField.SECOND_OF_MINUTE);
		int second = t.getSecond();
		System.out.println(second);
		//밀리초
		int milisecond = t.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(milisecond);
		
		//나노초
		int nanosecond = t.get(ChronoField.NANO_OF_SECOND);
//		int nanosecond = t.getNano();
		System.out.println(nanosecond);
		
	} // main

} // class
