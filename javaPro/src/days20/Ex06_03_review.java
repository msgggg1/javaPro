package days20;

import java.util.Date;

public class Ex06_03_review {

	public static void main(String[] args) {
		
		Date startdate = new Date(2025-1900, 2-1, 3, 9,0 ,0 );
		System.out.println(startdate.toLocaleString());
		System.out.println(startdate.getTime());

		Date enddate = new Date(2025-1900, 8-1, 8, 18,0 ,0 );
		System.out.println(enddate.toLocaleString());
		System.out.println(enddate.getTime());
		
		Date d = new Date(1754643600000L);
		System.out.println(d.toLocaleString());
		
	} // main

} // class
