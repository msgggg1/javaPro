package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import days20.days12;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 12:11:22
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 개강일 날짜 객체 25.2.3
//		Date d = new Date(2025-1900,2-1,3);
//		Calendar d = new gregri~
		
		/*
		//[1]
		//불변
		LocalDate d = LocalDate.now();
		// 년, 월, 일 수정 - with(), withxxx()
//		d = d.withYear(2024); // 꼭 저장해야함. 
		d = d.with(ChronoField.YEAR, 2024);// 위와 같은 코딩
		System.out.println(d);
		
		d= d.withMonth(2);
		d= d.with(ChronoField.MONTH_OF_YEAR, 2);
		
		d= d.withDayOfMonth(3);
		System.out.println(d);
		*/
		
		/*
		//[2] 2025-02-03 날짜 객체가 필요
		LocalDate d = LocalDate.of(2025, 2, 3); // 바로 객체 생성 가능
		System.out.println(d);
		*/
		
		//A 	생일 	1990.02.5
		//B 	생일 	1992.03.4
		//C 	생일 	2000.04.5
		// 생일 지났는지 여부 출력하는 코딩
		// 결과 : 오늘이 생일이다.
		// 		 생일이 지났다.
		//		 생일이 지나지 않았다. 
		
		
		LocalDate A = LocalDate.of(1990, 2, 5);
		LocalDate B = LocalDate.of(1992, 3, 4);
		LocalDate C = LocalDate.of(2000, 4, 5);
		LocalDate today = LocalDate.now();
		
		A = A.withYear(today.getYear());
		B = B.withYear(today.getYear());
		C = C.withYear(today.getYear());
		
		System.out.println(today.compareTo(A));
		System.out.println(today.compareTo(B));
		System.out.println(today.compareTo(C));
		
		/*
		System.out.println(today.isBefore(A));
		System.out.println(today.isEqual(A));
		System.out.println(today.isAfter(A));
		*/
		
		/* 배열로 처리
		LocalDate[] localDateList = {LocalDate.of(1990, 2, 5),LocalDate.of(1992, 3, 4), LocalDate.of(2000, 4, 5)};
	      LocalDate now = LocalDate.of(2025, 3, 4);
	      
	      for(LocalDate localDate : localDateList) {
	         if (now.isEqual(localDate)) {
	            System.out.println("오늘이 생일이다");
	         } else if(now.isBefore(localDate) ) {
	            System.out.println("생일이 지나지 않았다");
	         } else {
	            System.out.println("생일이 지났다");
	         }
	      }
	      */
		
		
	} // main

	/*
	private static void isBirthday(LocalDate d) {
		if (d.isAfter(now)) {
			System.out.println("생일이 지나지 않았다. ");
		} else if (d.isBefore(now)) {
			System.out.println("생일이 지났다. ");
		} else if (d.isEqual(now)) {
			System.out.println("오늘이 생일이다.");
		} // if
	}
*/
} // class
