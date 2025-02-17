package days08;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// [문제] 년도를 입력받아서 윤년/평년 출력  
		
		int year;
		Scanner sc = new Scanner(System.in);
		year = getYear(sc);
		
		if (isLeapYear(year)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		} //else

	} // main

	private static boolean isLeapYear(int year) {
		  //              &&     >    ||
	      return year % 4  == 0 && year % 100  != 0 || year % 400  == 0 ;
	}

	private static int getYear(Scanner sc) {
		// 년도 유효성 검사 리턴. 1년~
		String regex = "\\d*";
		String strYear ;
		do {
			System.out.println("> 년도 입력?");
			strYear = sc.next();
		} while (!strYear.matches(regex));
		
		
		return Integer.parseInt(strYear);
	}

} //class
