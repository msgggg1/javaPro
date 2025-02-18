package days12;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.util.Graphic2D;
import com.util.MyCalender;

/**
 * @author msg
 * @date 2025. 2. 18. - 오후 3:09:25
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 달력 그리기
		// 년도와 월 입력? => 달력
		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.printf("> year, month input?");
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);

	} // main

	private static void printCalendar(int year, int month) { // 1일 요일, 한달 며칠

		// 1. 년 월 1일 무슨요일?
		//  1) 2025.2.1 까지의 총 날짜 수를 계산 % 7    0(일) 1(월) ... 6(토)
		int dayOfWeek = getDayOfWeek(year, month, 1);


		// 2. 년 월 마지막 날짜? 28 ,29, 30, 31
		int lastDay = getLastDay(year,month);

		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Graphic2D.drawLine(68,"-");
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		} // for i
		System.out.println();
		Graphic2D.drawLine(68,"-");
		// 1의 날짜 위치 for문 \t
		for (int i = 0; i < dayOfWeek; i++) System.out.printf("\t");
		
//		System.out.printf("\t%d",1);
		// 1 ~ lastDay 달력 출력                   //    1 2 3 4 5
												//6 7 8 9 101112
		for (int i = 1; i <= lastDay ; i++) {
			System.out.printf(isToday(year, month, i)?"\t[%d]":"\t%d", i);
			if ((i+dayOfWeek)%7 == 0) System.out.println();
		} // for i
		
		System.out.println();
		
		Graphic2D.drawLine(68,"-");
		
		
	} // printCalendar
	
	public static boolean isToday(int year, int month, int day) {
		Date d = new Date();
		int todayYear = d.getYear() + 1900;
		int todayMonth = d.getMonth() + 1;
		int todayDay = d.getDate();
		if (todayYear == year && todayMonth == month && todayDay == day) {
			return true;
			
		} else
			return false;
	}

	private static int getLastDay(int year, int month) {
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2&& MyCalender.isLeapYear(year)) return 29;
		return daysInMonth[month];
	}

	private static int getDayOfWeek(int year, int month, int day) {

		// 1.1.1 ~ year.month.1
		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays%7;
		return dayOfWeek;
	}

	private static int getTotalDays(int year, int month, int day) {
		// 2025.5.1
		int totalDays = 365 * (year-1) + (year-1)/4 - (year-1)/100 + (year-1)/400;

		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 1월부터 (month - 1)월까지의 일수 추가
		for (int i = 1; i < month; i++) {
			totalDays += daysInMonth[i];
		}
		// 윤년이면 2월을 29일로 조정
		if (month > 2 &&  MyCalender.isLeapYear(year) ) {
			totalDays++;
		}
		totalDays += day;
		
		return totalDays;
	}



} // class
