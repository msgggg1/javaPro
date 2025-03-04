package days21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 12:38:47
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// now(), of()
		// with(), withXXX()
		// **plus(), plusXXX()
		// **minus(), minusXXX()
		
		// 이번 달의 마지막 날짜가 몇 일?
		/*
		LocalDate d = LocalDate.now();
		d = d.withDayOfMonth(1); // 불변 -> 꼭 d로 받아야함
		d = d.plusMonths(1);
		d = d.minusDays(1);
		
		System.out.println(d);
		int date = d.getDayOfMonth();
		System.out.println(date);
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println(t); //12:43:01.021202200

		// 초 밑으로 절삭
		t = t.truncatedTo(ChronoUnit.SECONDS); //temporal unit 구현한 클래스
		System.out.println(t);
		t = t.truncatedTo(ChronoUnit.HOURS);
		System.out.println(t);
		
		t = t.plus(2, ChronoUnit.HOURS);
		System.out.println(t);
		
		
	} // main

} // class
