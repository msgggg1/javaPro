package days20;

import java.util.Date;

public class Ex06_02_review {

	public static void main(String[] args) {
		// 달력 그리기
		int year = 2025;
		int month = 3;
		
		//[1] 날짜 설정 set, get
//		Date d= new Date();
//		d.setYear(year-1900);
//		d.setMonth(month-1);
//		d.setDate(1);
//		System.out.println(d);
		
		//[2] Date. 생성자 통해서 
		Date d = new Date(year-1900, month-1, 1);
		System.out.println(d);
		

	} // main

} //class
