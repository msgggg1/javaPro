package days20;

import java.util.Date;

public class Ex_06_review {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getYear()+1900);
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getTime());

	}// main

} // class
