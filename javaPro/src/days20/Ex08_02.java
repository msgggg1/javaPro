package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex08_02 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(Ex07.getCalendar(today));
		Calendar startDate = new GregorianCalendar(2025 ,1-1,28);
		System.out.println(Ex07.getCalendar(startDate));
		
		System.out.println(today.after(startDate));
		
	} // main
	
}// class
