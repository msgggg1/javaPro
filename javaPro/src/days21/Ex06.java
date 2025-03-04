package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 2:07:19
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [TemporalAdjusters 클래스]
		// = Temporal + Adjusters
		//    시간의 		조정자

		// 날짜와 시간 수정 : plus(), plusXXX(), minus(), minusXXX()	
//							with(), withXXX()
		// 자주 사용되는 날짜/시간을 수정(조정) 하는 기능이 구현된 클래스 temporalAdjusters (사진 참조)
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		//이번달 첫 월요일?
//		d= d.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
//		System.out.println(d);

		// [문제] 이번달 마지막 토요일
//		d= d.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY));
//		System.out.println(d);
		
		// [다음주 수요일]
		// 오늘날짜 - 2025-03-04(화)
		//1(월) ~7(일)
		
//		int dayOfWeek = d.getDayOfWeek().getValue();
//		
//		if (dayOfWeek < DayOfWeek.WEDNESDAY.getValue()/*3*/) { // 수요일 보다 작을 경우
//			d= d.plusWeeks(1);			
//		} // if
//		d= d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		
//		d= d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)).with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
//		d= d.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));		
//		System.out.println(d);
		
		//[문제] 이번 달 3번째 목요일?
		d = d.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY));
		System.out.println(d);
		
		// 몇 번째 주인지 나타내는 필드 : 
//		ChronoField.ALIGNED_WEEK_OF_MONTH
		
		
		
	} // main

} // class
