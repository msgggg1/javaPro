package days09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
			//830412-2700001
		
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
		//1. 성별
		boolean gender = getGender();
		System.out.println(gender);
		
		// 2. century(세기)반환 메서드
		
		
//			int century = getCentury(rrn);
//			System.out.println(century);
//			
//			// 3. 국적 -외(false)/내국인(true)
//			
//			boolean nationality = getNationality(rrn);
//			System.out.println(nationality? "koreans":"foreigner");
			
	}

	private static boolean getGender(String rrn) {
		String strGender = rrn.substring(7,8);
		int gender = Integer.parseInt(strGender);
		
		return gender%2==1 ? "남자": "여자";
	}
	
	

	private static String getRrn(Scanner scanner) {
		String regex = "\\d{6}-\\d{7}";
		return null;
		String rrn ;
		
		do {
			System.out.print("주민번호 14자리 입력");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		
		return rrn;
	} // main
	


//	private static boolean getNationality(String rrn) {
//		char gender = rrn.charAt(7);  // rrn.charAt - '0'
//		switch (gender) {
//		case '0' : case '9':
//		case '1' : case '2' : case '3' : case '4':
//			return true ;
//		
//		default:
//			return false;
//		}
//	}

//	private static int getCentury(String rrn) {
//		
//		char gender = rrn.charAt(7);  // rrn.charAt - '0'
//		switch (gender) {
//		case 0 : case 9:
//			return 1800;
//		
//		case 1 : case 2 : case 5 : case 6:
//			return 1900 ;
//		
//		default:
//			return 2000;
//		}
//	}
		
//		String strCentury = rrn.substring(7,8);
//		int century = Integer.parseInt(strCentury);
//		switch (century) {
//		case 0 : case 9:
//			return 1800;
//		
//		case 1 : case 2 : case 5 : case 6:
//		return 1900;
//			
//		
//		default:
//		return 2000;
//		} // switch
//		
//	}




//		// char rrn.charAt(index);   
//		// String rrn.ssubstring
//		char gender = rrn.charAt(7);  // rrn.charAt - '0'
//		switch (gender) {//gender - '0'   or case '9'
//		case 9: case 1
//			
//			break;
//
//		default:
//			break;
//		} // switch
//		
//	}

	} // main

} //class
