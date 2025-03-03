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
		
		//[3] year, month, 마지막 날짜?
		System.out.println(d.getDate());
		d.setMonth(d.getMonth()+1);
		d.setDate(d.getDate()-1);
		System.out.println(d);
		System.out.println(d.getDay());
		

	} // main

} //class
