package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

public class Ex08_review {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.printf("> year, month input?");
		year = scanner.nextInt();
		month = scanner.nextInt();
		
		printCalendar(year, month);

	} // main

	private static void printCalendar(int year, int month) {
		Calendar startDate = getStartDate(year, month);
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, "-");
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
	}
		System.out.println();
		Graphic2D.drawLine(60, "-");
		//StartDate ~42일 날짜
		for (int i = 0; i < 42; i++) {
			int date = startDate.get(Calendar.DATE);
			System.out.printf(isToday(startDate)?"\t[%d]":"\t%d", date);
			if (i%7 == 6 ) System.out.println();
			startDate.add(Calendar.DATE, 1);
		} //for
	}

	private static boolean isToday(Calendar startDate) {
		Calendar today = Calendar.getInstance();
		today = new GregorianCalendar(today.get(1),today.get(2),today.get(5));
		return today.equals(startDate);
	}

	private static Calendar getStartDate(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek+1);
		return c;
	}

} // class
