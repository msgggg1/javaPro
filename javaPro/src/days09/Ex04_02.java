package days09;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 13. - 오후 12:34:02
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
			//830412-2700001
			Scanner scanner = new Scanner(System.in);
			String rrn = getRrn(scanner);
			System.out.println(rrn);
			
			// 생년월일 -> "1983년 4월 12일"
			String birthday = getBirthday(rrn);
			System.out.println(birthday);
			
			
			
	} // main

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
