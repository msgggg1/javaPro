package days09;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 13. - 오후 12:34:02
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {

		//830412-2700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);

		// 주민등록번호를 가지고 한국나이, [만나이] ...

		// 1. 세는 나이
		int age = getCountingAge(rrn);


		// 2. 만 나이
		// `만나이 = 현재 연도 - 출생 연도 - (생일이 지났으면 0, 생일이 안 지났으면 1)`
//		int age = getAmericanAge(rrn);
//		System.out.println(age);


		System.out.println(getAmericanAge(rrn));


	} // main

	// `만나이 = 현재 연도 - 출생 연도 - (생일이 지났으면 0, 생일이 안 지났으면 1)
	private static int getAmericanAge(String rrn) {
		
//		int month = Integer.parseInt( rrn.substring(2, 4) );
//		int day = Integer.parseInt( rrn.substring(4, 6) ); 
//
//		LocalDate d = LocalDate.now();
//		int currentYear = d.getYear();
//		int birthYear = getYear(rrn);
//				
//		
//		
//		if ( > 0) return currentYear - birthYear ;
//		else return currentYear - birthYear - 1 ;
		
		int americanAge = getCountingAge(rrn) - 1;
			
		int birthMD = Integer.parseInt(rrn.substring(2, 6));
		
		Date d = new Date();
		int currMD = (d.getMonth()+1)*100 + d.getDate()	;
		if (birthMD >= currMD) americanAge--;
		return americanAge;
		
		
		

	}

	private static int getCountingAge(String rrn) {
		//       [1]
		//		Date d = new Date();
		//		System.out.println(d.getYear()+1900);

		//[2]
		//		Calendar c = Calendar.getInstance();
		//		System.out.println(c.get(Calendar.YEAR));

		LocalDate d = LocalDate.now();
		int currentYear = d.getYear(); // 올해년도

		Integer.parseInt(getBirthday(rrn).substring(0, 4));
		int birthYear = getYear(rrn);

		return currentYear - birthYear + 1;
	}


	private static int getYear(String rrn) {
		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		return year;
	}



	private static String getBirthday(String rrn) {

		int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) ); 
		String birthday = String.format("%d년 %d월 %d일", year, month, day);
		return birthday;
	}

	private static boolean getNationality(String rrn) {
		char gender = rrn.charAt(7);  // rrn.charAt - '0'
		switch (gender) {
		case '0' : case '9':
		case '1' : case '2' : case '3' : case '4':
			return true ;

		default:
			return false;
		}
	}

	private static int getCentury(String rrn) {

		char gender = rrn.charAt(7);  // rrn.charAt - '0'
		switch (gender) {
		case 0 : case 9:
			return 1800;

		case 1 : case 2 : case 5 : case 6:
			return 1900 ;

		default:
			return 2000;
		}
	}


	private static String getRrn(Scanner scanner) {
		// 유효성 검사 숫자6-숫자7
		//		String regex = "[0-9]{6}-[0-9]{7}";
		String regex = "\\d{6}-\\d{7}";
		String rrn ;

		// [알림], 실패횟수
		do {
			System.out.print("주민번호 14자리 입력");
			rrn = scanner.next();
		} while (!rrn.matches(regex));

		return rrn;
	}

	private static boolean getGender(String rrn) { 

		//[2] String rrn .substring(0,0)
		String strGender = rrn.substring(7, 8); // "2"
		int gender = Integer.parseInt(strGender); // 2
		return  gender%2==1 ? true:false;


	}


} // class
