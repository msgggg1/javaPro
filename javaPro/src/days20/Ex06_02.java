package days20;

import java.util.Date;

/**
 * @author msg
 * @date 2025. 2. 28. - 오후 2:01:22
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 달력 그리기 - Date 클래스
		int year = 2025;
		int month = 3;
		
		// 1) 2025.3.1 	무슨 요일?
		// 2) 2025.3 	마지막 날짜?
		
		
		/*
		Date d = new Date();
		// getXXX();
		// setXXX();
		d.setYear(year-1900);
		d.setMonth(3-1);
		d.setDate(1);
		*/
		
		//[2]
		Date d = new Date(year-1900, month -1 ,1);
		
		//[3] year, month, 마지막 날짜?
		System.out.println(d.getDate()); // 일
//		int date = d.getDate();
//		d.setDate(date+1);
		
		//1달 더하기
		d.setMonth(d.getMonth() +1);
		//1일 빼기
		d.setDate(d.getDate()-1);
		System.out.println(d.getDate());
		System.out.println(d.toLocaleString());
		System.out.println(d.getDay());// 일(0) ~토(6)
		

	} // main

} // class
