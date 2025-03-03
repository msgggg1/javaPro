package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex07_02_review {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 2025);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DATE, 1);
		
//		c.set(2025, 3, 1);
//		
//		c = new GregorianCalendar(2025,3,1);
		
	
//		System.out.println(Ex07.getCalendar(c));
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("0일월화수목금토".charAt(dayOfWeek));
		
		// 4월의 마지막 날짜
//		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
		c.add(Calendar.MONTH, 1);
//		c.set(Calendar.DATE, c.get(Calendar.DATE)-1);
		c.add(Calendar.DATE, -1);
		System.out.println(Ex07.getCalendar(c));
		
		//[2] 
		System.out.println(c.getActualMaximum(Calendar.DATE));
	
	} // main

} // class
