package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import com.util.Graphic2D;

public class Ex08_review_review {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("year, month?");
		
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		printCalendar(year, month);

	} // main

	private static void printCalendar(int year, int month) {
		
		Calendar startDate = getStartDate(year,month);
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		Graphic2D.drawLine(68, "=");
		
		String week = "일월화수목금토";
		for (int j = 0; j < week.length(); j++) {
			System.out.printf("\t%c", week.charAt(j));			
		} //for
		System.out.println();
		Graphic2D.drawLine(68, "=");
		
		for (int i = 0; i < 42; i++) {
			int date = startDate.get(Calendar.DATE);
			System.out.printf(isToday(startDate)?"\t[%s]":"\t%s", date);
			if (i%7==6) System.out.println();
			startDate.add(Calendar.DATE, 1);
		} //for
	}


	private static boolean isToday(Calendar startDate) {
		Calendar c = Calendar.getInstance();
		c = new GregorianCalendar(c.get(Calendar.YEAR),c.get(Calendar.MONTH), c.get(Calendar.DATE));
		return c.equals(startDate);
	}

	private static Calendar getStartDate(int year, int month) {
		
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfweek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -(dayOfweek-1));
		return c;
	}


} // class
