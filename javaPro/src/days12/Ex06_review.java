package days12;

import java.util.Date;
import java.util.Scanner;

import com.util.Graphic2D;
import com.util.MyCalender;

public class Ex06_review {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.printf("> year, month input?");
		year = scanner.nextInt();
		month = scanner.nextInt();
		
		printCalendar(year, month);

	

	}// main

	private static void printCalendar(int year, int month) {
		
		// 2025년 4월 1일 무슨요일?
		int dayOfWeek = getDayOfweek(year, month, 1);
		
		//2025년 4월 마지막 날?
		int lastDay = getLastDay(year, month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Graphic2D.drawLine(68, "=");
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		} //for
		System.out.println();
		Graphic2D.drawLine(68, "=");
		
		//1날짜 위치 for문 \t
		for (int i = 0; i < dayOfWeek; i++) System.out.print("\t");
		
		//1~lastDay 출력
		for (int i = 1; i <=lastDay; i++) {
			System.out.printf(isToday(year,month,i)?"\t[%d]":"\t%d", i);
			if ((i+dayOfWeek)%7==0) System.out.println();
		} //for
		
	}// print

	private static boolean isToday(int year, int month, int i) {
		Date d = new Date();
		int todayYear = d.getYear()+1900;
		int todayMonth = d.getMonth()+1;
		int todayDay = d.getDate();
		if (todayYear==year && todayMonth == month && todayDay == i) return true;
		
		else return false;
	}

	private static int getLastDay(int year, int month) {
		int [] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (month ==2 && MyCalender.isLeapYear(year)) return 29;
		return daysOfMonth[month];
	}

	private static int getDayOfweek(int year, int month, int day) {
		
		int totalDays = getTotalDays(year, month,day);
		int dayOfWeek = totalDays%7;
		
		return dayOfWeek;
	}

	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 365 * (year-1)+((year-1)/4 - (year-1)/100 + (year-1)/400);
		int [] daysOfMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 1; i < month; i++) {
			totalDays += daysOfMonth[i];
		} //for
		if (MyCalender.isLeapYear(year)) totalDays++;
		 totalDays += day;
		 
		return totalDays;
	}

}// class
